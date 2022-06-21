  # rescursive wd201
keerthi = {
    :tag => "h1" ,
    :text => "this is the heading" ,
}
 
def render(node)
    if node[:tag] == "h1"
        p "the tag is #{node[:tag]}"
        p node[:text]
    end
end
render(keerthi)