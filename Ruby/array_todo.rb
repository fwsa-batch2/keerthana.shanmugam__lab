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

 todos.each{|x|
     arr1.push (x[0]) if x[1] == "money"
     arr2.push (x[0]) if x[1] == "organize"
     arr3.push (x[0]) if x[1] == "food"
 }
puts ["money", "#{arr1}"], ["organize", "#{arr2}"], ["food", "#{arr3}"]

  # When you find something from an array and it doesn't exist, then Ruby will return nil. 
  # You can check if something is nil like this:
nums = [1,2,3,11]
large_number = nums.find {|i| i > 10}
if large_number == nil
  puts "No large numbers!"
else
  puts large_number
end