import { createContext, useState, useCallback, useMemo } from 'react'

export const ExpandableContext = createContext()
const { Provider } = ExpandableContext

const ExpandableState = ({ children, initialExpanded = "person2"  }) => {
  const [expanded, setExpanded] = useState(initialExpanded)
  const toggle = useCallback(
    (id) => setExpanded(id),
    []
  )
  const reset = useCallback(
    () => {
      setExpanded(initialExpanded)
    },
    [initialExpanded]
  )
  const value = useMemo(
   () => ({ expanded, toggle,reset }), 
   [expanded, reset, toggle]
  )
  return (
    <Provider value={value}>
        {children}
    </Provider>
  )
}

export default ExpandableState