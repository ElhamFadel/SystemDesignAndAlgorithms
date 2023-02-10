import {useContext} from "react";
import * as Expandable from "./expandableStyle";
import { ExpandableContext } from './ExpandableState'

function ExpandablePresentational({id,image,content}) {
      const { expanded,toggle } = useContext(ExpandableContext);
  return (
    <Expandable.Content className="expandable__content" isActive={expanded===id} onClick={()=>toggle(id)}>
    <Expandable.ImageContainer className="expandable__image">
        <img src={image} alt={id} />
    </Expandable.ImageContainer>
    <Expandable.Icon className="expandable__icon"></Expandable.Icon>
    <Expandable.Body className="expandable__body">{content}</Expandable.Body>
    </Expandable.Content>
  )
}

export default ExpandablePresentational