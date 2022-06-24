Rails.application.routes.draw do
  
  # For details on the DSL available within this file, see https://guides.rubyonrails.org/routing.html

  # get 'beauty_apps/index'
  match 'a', :to => 'beauty_apps#index', :via => 'get'

  match 'users/new_file', :to => 'users#new_file', :via => :get
  match 'users/create', :to => 'users#create', :via => :post

  match 'todos/index', :to => 'todos#index', :via => :get
  match 'todos/test_todo', :to => 'todos#test_todo', :via => :post

end

