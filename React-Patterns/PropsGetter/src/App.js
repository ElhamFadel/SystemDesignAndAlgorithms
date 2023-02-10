import useExpanded from "./useExpanded";
import {Expandable} from "./components";
import {image2,image3 } from "./assets";
import './App.css';
const information = [
  {
    id:"person1",
    image:image3,
    content:"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce eget lorem convallis, elementum risus non, ornare leo. Maecenas ut urna at enim pretium malesuada ac eget nisi."
  },
  {
    id:"person2",
    image:image2,
    content:"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce eget lorem convallis, elementum risus non, ornare leo. Maecenas ut urna at enim pretium malesuada ac eget nisi."
  },
  {
    id:"person3",
    image:image3,
    content:"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce eget lorem convallis, elementum risus non, ornare leo. Maecenas ut urna at enim pretium malesuada ac eget nisi."
  }
]

function App() {
  const {expanded,toggleExpanded} = useExpanded();
  return (
    <div className="App">
      {
        information.map((props)=><Expandable {...props}  />)
      }
    </div>
  );
}

export default App;
