# def get_command_line_argument
#     if ARGV.empty?
#       puts "Usage: ruby lookup.rb <domain>"
#       exit
#     end
#     ARGV.first
# end
#   domain = get_command_line_argument
  
#   dns_raw = File.readlines("zone")
  
#   Ladoo = /^[a-zA-Z0-9][a-zA-Z0-9-]{1,61}[a-zA-Z0-9]\.[a-zA-Z]{2,}$/
#   def is_valid_url url 
#      return (url =~ Ladoo)? false : true
#   end
  
#    def parse_dns(dns_raw)
#      valid_record_types = ["A","CNAME"]
#      dns_raw_filter = dns_raw.select { |line| valid_record_types.include? ((line.split(",")[0])) }
#      dns_raw_split = dns_raw_filter.map { |line| (line.split(","))}
#      dns_raw_reject = dns_raw_split.reject do |record|
#      record.length != 3
#      end
  
#      dns_raw_reject.each_with_object({}) do |record, records|
      
#      record_strip = record.map{|rec| rec.strip()}
  
#       if (is_valid_url(record[1]))
#         records[record_strip[1]] = { record_type: record_strip[0], destination: record_strip[2] }
#       end
#      end
#    end
  
#   def resolve(dns_records, lookup_chain, domain)
#        record = dns_records[domain]
#      if (!record)
#        lookup_chain[0] = "Error: Record not found for " + domain
#        return lookup_chain 
  
#      elsif record[:record_type] == "A"
#        return lookup_chain << record[:destination]
  
#      elsif record[:record_type] == "CNAME"
#        lookup_chain << record[:destination]
#        resolve(dns_records, lookup_chain, record[:destination])
  
#      else
#        lookup_chain[0] = "Invalid record type for " + domain
#        return lookup_chain
#      end
#   end
  
#   dns_records = parse_dns(dns_raw)
#   lookup_chain = [domain]
#   lookup_chain = resolve(dns_records, lookup_chain, domain)
#   puts lookup_chain.join(" => ")

def get_command_line_argument
  if ARGV.empty?
    puts "Usage: ruby lookup.rb <domain>"
    exit
  end
  ARGV.first
end
domain = get_command_line_argument
dns_raw = File.readlines("zone")
def parse_dns(dns_raw)
  dns_records = { RECORD_TYPE: [] , SOURCE: [] , DESTINATION: [] }
  for i in (dns_raw.filter {|x| (x[0] != "#") && (x != "\n")})
      dns_records[:RECORD_TYPE].push((i.split(","))[0].strip())
      dns_records[:SOURCE].push((i.split(","))[1].strip())
      dns_records[:DESTINATION].push((i.split(","))[2].strip())
  end
  puts dns_records
  dns_records
end
def resolve( dns_records , lookup_chain , domain )
  if (dns_records[:SOURCE].include? domain)
      index = (dns_records[:SOURCE]).find_index(domain)
      if ((dns_records[:RECORD_TYPE][index]) == "A")
       lookup_chain.push((dns_records[:DESTINATION])[index])
      elsif ((dns_records[:RECORD_TYPE][index]) == "CNAME")
       new_domain = (dns_records[:DESTINATION])[index]
       resolve( dns_records , lookup_chain , new_domain )
     end
  else
      lookup_chain.push("IP Address not found for the given domain")
  end
  lookup_chain
end
dns_records = parse_dns(dns_raw)
lookup_chain = [domain]
lookup_chain = resolve(dns_records, lookup_chain, domain)
puts lookup_chain.join(" => ")