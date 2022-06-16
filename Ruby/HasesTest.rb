  # Practice : 1
library = {
    "rowling" => "Harry Potter",
    
    "lahiri" => "Interpreter of Maladies"
}
puts library["lahiri"]

  # Practice : 2
library = {}
library["austen"] = ["Pride and Prejudice", "Sense and Sensibility"]
library["asimov"] = ["Robots of Dawn", "I, Robot"]

authors = library.keys
puts "These are the authors in my catalog : #{authors.join(', ')}"

library.each do |author, books|
puts "#{author.capitalize} wrote the books #{books.join(', ')}"
end

   # problem : 1
books = ["Design as Art", "Anathem", "Shogun"]
authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]

cat = {}
for value in 0...books.length do
    for a in 0...authors.length do
        if value == a
            k = authors[a].split.first.downcase.to_sym
            r = 
            books[value]
            cat.store(k,r)
        end
    end
end
p cat

  # problem : 2
todos = [
    ["Send invoice", "money"],
    ["Clean room", "organize"],
    ["Pay rent", "money"],
    ["Arrange books", "organize"],
    ["Pay taxes", "money"],
    ["Buy groceries", "food"]
  ]

  arr1 = []
  arr2 = []
  arr3 = []
  dog = {}

for val in 0...todos.length do
for tiger in 0...todos[val].length do
    if todos[val][tiger + 1] == "money"
       array1 = arr1.push(todos[val][tiger])
        dog.store((todos[val][tiger+1]).to_sym,array1)
    end
    
end
end
p dog