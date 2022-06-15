    # Create a new, transformed array from an existing array.
nums = [2, 4, 200, 400]
new_nums = nums.map {|number| number + 125 }
new_nums.each {|n| puts n }

    # A nested array of first names and last names, return a new array with the full names.
names = [["Jhumpa", "Lahiri"], ["J.K", "Rowling"], ["Devdutt", "Pattanaik"]]
# new_ar = []
# names.each{|x|
#     str = ""
#    x.each{|y|str = ("#{str} #{y}")}
# new_ar.push(str)
# }
# print new_ar
names.join("")
 
new_ar = []
for ten in names do
    new_ar.push(ten.join(""))
end
p new_ar

   # Two array merge them and print who wrote which book.
books = ["Design as Art", "Anathem", "Shogun"]
authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]

books.map.with_index do |books, i|
   
authors.map.with_index do |authors, j| 

    if i == j
        p "#{books} was written by #{authors}"
    end
end
end    
