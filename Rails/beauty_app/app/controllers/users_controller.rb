class UsersController < ApplicationController
    def new_file

    end
     
    def create
        user = User.new(user_params)
        if user.save
            render plain: "successfull"
        else
            render plain: "failed"
        end
    end

    private
    def user_params
        params.require(:user).permit(:first_name, :last_name, :email, :password)
    end

end

