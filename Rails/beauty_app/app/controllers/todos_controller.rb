class TodosController < ApplicationController
  def index
  end

  def test_todo
    todo = Todo.new (task_todo)
    todo.save
  end

  private
  def task_todo
    params.require(:todo).permit(:task, :date)
  end

end
