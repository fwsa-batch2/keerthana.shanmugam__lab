one = {
    :jan => "j" ,
    :dec => "Dec is the short form of the month December" ,
}
two = {
    :jan => "january" ,
    :aug => [one] ,
}

def recurse (node)
    if node[:jan] == "j"
        puts "j: "
        puts node[:dec]
    elsif node[:jan] == "january" 
        augu = node[:aug]
        puts augu.each{|x| recurse(x)}
    end
end

recurse(two)