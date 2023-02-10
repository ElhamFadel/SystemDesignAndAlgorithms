import * as Expandable from "./expandableStyle"
function ExpandablePresentational({id,image,content}) {
  return (
    <Expandable.Content className="expandable__content">
    <Expandable.ImageContainer className="expandable__image">
        <img src={image} alt={id} />
    </Expandable.ImageContainer>
    <Expandable.Icon className="expandable__icon"></Expandable.Icon>
    <Expandable.Body className="expandable__body">{content}</Expandable.Body>
    </Expandable.Content>
  )
}

export default ExpandablePresentational