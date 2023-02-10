import { useCallback, useMemo, useState} from "react"
export default function useExpanded () {
  const [expanded, setExpanded] = useState();

  const toggleExpanded = useCallback(
    ()=>setExpanded((prevState)=>!prevState)
  ,[])


  const value = useMemo(() => ({ expanded, toggleExpanded }), [
    expanded,
    toggleExpanded,
  ])
  return value
}