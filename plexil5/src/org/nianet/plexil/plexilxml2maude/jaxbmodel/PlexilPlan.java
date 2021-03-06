//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.03 at 09:23:03 AM COT 
//


package org.nianet.plexil.plexilxml2maude.jaxbmodel;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.Set;
import java.util.StringTokenizer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.nianet.plexil.plexilxml2maude.jaxbmodel.ext.PlexilScriptException;
import org.nianet.plexil.scriptcontext.jaxbmodel.generated.EnumerationEntry;
import org.nianet.plexil.scriptcontext.jaxbmodel.generated.PLEXILScript;
import org.nianet.plexil.scriptcontext.jaxbmodel.generated.RandomValue;
import org.nianet.plexil.scriptcontext.jaxbmodel.generated.PLEXILScript.Step;
import org.nianet.plexil.scriptcontext.jaxbmodel.generated.PLEXILScript.Step.State;
import org.nianet.plexil.scriptcontext.utilities.RandomPlx;




/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}GlobalDeclarations" minOccurs="0"/>
 *         &lt;element ref="{}Node"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{}FileName"/>
 *       &lt;attribute ref="{}LineNo"/>
 *       &lt;attribute ref="{}ColNo"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "globalDeclarations",
    "node"
})
@XmlRootElement(name = "PlexilPlan")
public class PlexilPlan {
	
	/**
	 * Map used to store equivalences between node's names and absolute node's names.
	 * NOTE: The absolute node's path is required by maude's syntax, but this attribute, as an
	 * static one, restricts the usage of the model to just one plexil plan at the same
	 * time.
	 */
	private static Map<String,String> nodesAbsolutePathMap=new Hashtable<String, String>();
	

	/**
	 * Map used to store nodes' information from the most recently loaded Plan. This information
	 * is required later by additional use-cases like model checking.
	 */
	private static Map<String,String> lastLoadedPlanNodesAbsNamesMap=nodesAbsolutePathMap;
	private static Map<String,Node>   lastLoadedPlanNodes=new Hashtable<String, Node>();
	
	
	public static Map<String, String> getLastLoadedPlanNodesAbsNamesMap() {
		return lastLoadedPlanNodesAbsNamesMap;
	}
	
	public static Map<String,Node> getLastLoadedPlanNodes(){
		return lastLoadedPlanNodes;
	}


	public static void resetPlexilPlansInfo(){
		//keep nodes information for post-processing use-cases, like model-checking.
		if (nodesAbsolutePathMap.size()>0){
			lastLoadedPlanNodesAbsNamesMap=nodesAbsolutePathMap;			
			nodesAbsolutePathMap=new Hashtable<String, String>();
		}
	}
	
    @XmlElement(name = "GlobalDeclarations")
    protected GlobalDeclarations globalDeclarations;
    @XmlElement(name = "Node", required = true)
    protected Node node;
    @XmlAttribute(name = "FileName")
    protected String fileName;
    @XmlAttribute(name = "LineNo")
    protected BigInteger lineNo;
    @XmlAttribute(name = "ColNo")
    protected BigInteger colNo;

    public static String getNodeAbsoluteName(String shortName){
    	return nodesAbsolutePathMap.get(shortName);
    }
    
    
    /**
     * Gets the value of the globalDeclarations property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalDeclarations }
     *     
     */
    public GlobalDeclarations getGlobalDeclarations() {
        return globalDeclarations;
    }

    /**
     * Sets the value of the globalDeclarations property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalDeclarations }
     *     
     */
    public void setGlobalDeclarations(GlobalDeclarations value) {
        this.globalDeclarations = value;
    }

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link Node }
     *     
     */
    public Node getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link Node }
     *     
     */
    public void setNode(Node value) {
        this.node = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the lineNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineNo() {
        return lineNo;
    }

    /**
     * Sets the value of the lineNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineNo(BigInteger value) {
        this.lineNo = value;
    }

    /**
     * Gets the value of the colNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColNo() {
        return colNo;
    }

    /**
     * Sets the value of the colNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColNo(BigInteger value) {
        this.colNo = value;
    }
    
    /**
     * return all child nodes
     * @return
     */
    public Node getRootNode(){
    	return getNode();
    }

    
    
    public void setNodesLexicalScopedVariables(){
    	setNodesLexicallyScopedVariables(this.getNode(), new Hashtable<String, String>());
    }
    
    /**
     * This method set to each node all the variables that it may reach by
     * its lexical scope, and associates them with its absolute name (parent nodes path + var id
     * as is requierd by maude syntax
     * @param root
     */
    private static void setNodesLexicallyScopedVariables(Node root, Map<String,String> parentNodeVars){
    	    	
    	Map<String,String> localVariables=root.getLexicalScopeVariables();
    	
    	if (root.getVariableDeclarations()!=null){
    		List<Object> localVars=root.getVariableDeclarations().getDeclareVariableOrDeclareArray();
    		//assign local variables to root node
    		for (Object o:localVars){
    			if (o instanceof DeclareVariable){
    				String vname=((DeclareVariable)o).getName();
    				//update localVariables map, which is already referenced by root node.
    				localVariables.put(vname, "'"+vname+" . "+root.getAbsoluteID());    				
    			}
    			else{
    				throw new RuntimeException("XML-Plexil to maude translator doesn't support the given variable type:"+o.getClass());
    			}
    		}
    	}
    	
		//assign variables from parent nodes
		Set<String> parentVarKeys=parentNodeVars.keySet();
		for (String parentVarKey:parentVarKeys){
			localVariables.put(parentVarKey, parentNodeVars.get(parentVarKey));
		}
    	
    	//set variables on all descendant nodes
		List<Node> childs=root.getChildNodes();

		if (childs!=null){
			for (Node n:childs){
				setNodesLexicallyScopedVariables(n, localVariables);
			}			
		}
    	
    }
    
    /**
     * This method set absolute name for each node in the plan.
     * int the format:
     * ('OneMeter . 'Loop . 'SafeDrive)
     */
	public void fillOnNodesAbsolutePath(){		
		fillNodesAncestorsPath(this.getNode(), "", nodesAbsolutePathMap);
	}
    
    private static void fillNodesAncestorsPath(Node root,String parentName, Map<String,String> absNames){
		
    	//keep nodes on a map for post-processing actions, like model-checking.
    	lastLoadedPlanNodes.put(root.getNodeId(), root);
    	
    	
    	String pathSuffix=(parentName.trim().equals("")?"":(parentName));
		
		String pathToAdd="'"+root.getNodeId()+(!pathSuffix.equals("")?(" . "+pathSuffix):"");
		
		root.setAbsoluteID(pathToAdd);
		
		String res=absNames.put(root.getNodeId(), pathToAdd);		
		
		//if (res!=null){
		//	throw new RuntimeException("This XML-Plexil to Maude translator doesn't allow repeated node's id. Existent:"+res+". New:"+pathToAdd);
		//}
		
		List<Node> childs=root.getChildNodes();

		if (childs!=null){
			for (Node n:childs){
				fillNodesAncestorsPath(n, pathToAdd, absNames);
			}			
		}
		
	}
    
   
    
    public String generateMaudeModule(PLEXILScript script) throws PlexilScriptException{
    	StringBuffer sf=new StringBuffer();
    	
    	sf.append("mod "+this.getRootNode().getNodeId().toUpperCase()+" is\n protecting PLEXILITE-PREDS .\n\n\n");
    	
    	generateNodeBodies(sf, this.getRootNode());
    	    	
    	Hashtable<String,State> statesInContext=new Hashtable<String, State>();
    	
    	sf.append("op "+this.getRootNode().getNodeId()+"Env : -> ContextList .\n");
    	
    	if (script!=null){
    		
    		List<Step> steps=script.getStep();
    		
    		boolean onFirstStep=true;
    		
    		Iterator<Step> stepsIterator=steps.iterator();
    		while (stepsIterator.hasNext()){
    		
    			Step sp=stepsIterator.next();
    			
    			List<State> states=sp.getState();
    			    			
    			for (State stt:states){    				
    				statesInContext.put(stt.getName(), stt);
    			}
    			
    			Enumeration<State> statesEnum=statesInContext.elements();
    			
    			if (onFirstStep){
    				sf.append("eq "+this.getRootNode().getNodeId()+"Env = (");    				
    				onFirstStep=false;
    			}
    			else{
    				sf.append("\t# (");
    			}
    			
    			
    			while (statesEnum.hasMoreElements()){    				    				    				    				
    				State s=statesEnum.nextElement(); 
    				
    				//check if the state has a constant or random value
    				
    				if (s.getValue()!=null){
    					
    					String value;
    
    					value=s.getValue();
    					    					    					
        				if (statesEnum.hasMoreElements()){
            				sf.append("("+adjustExternalVariableName(s.getName())+") : v("+value+") ,");	
            			}
            			else{
            				sf.append("("+adjustExternalVariableName(s.getName())+") : v("+value+"))"+(stepsIterator.hasNext()?"":" .")+"\n");
            			}  					    						    					
    				}
    				else if (s.getRandomValue()!=null){
    					String value;
    					
    					if (s.getType().equals("boolean") && (s.getRandomValue().getMin()!=null || s.getRandomValue().getMax()!=null  )){
    						throw new PlexilScriptException("Invalid Plexil script: min or max attributes are not allowed on boolean <RandomValue>");
    					}
    					    
    					
    					if (s.getRandomValue().getEnumeration()!=null && s.getRandomValue().getEnumeration().size()>0){
    						List<EnumerationEntry> randomValuesEnum= s.getRandomValue().getEnumeration();
    						if (statesEnum.hasMoreElements()){
                				sf.append("("+adjustExternalVariableName(s.getName())+") : v("+randomValuesEnum.get(RandomPlx.getInstance().getInt(0, randomValuesEnum.size()-1)).getValue()+") ,");	
                			}
                			else{
                				sf.append("("+adjustExternalVariableName(s.getName())+") : v("+randomValuesEnum.get(RandomPlx.getInstance().getInt(0, randomValuesEnum.size()-1)).getValue()+"))"+(stepsIterator.hasNext()?"":" .")+"\n");
                			} 
    					}
    					else{
        					//null min and max value are interpreted as random boolean values
        					if (s.getRandomValue().getMin()==null && s.getRandomValue().getMax()==null){
        						if (s.getType().equals("int")){
        							value=""+RandomPlx.getInstance().getInt();
        						}
        						else if (s.getType().equals("float")){
        							value=""+RandomPlx.getInstance().getFloat();
        						}
        						else if (s.getType().equals("boolean")){
        							value=""+RandomPlx.getInstance().getBoolean();	
        						} 
        						else{
        							throw new PlexilScriptException("Invalid Plexil script: unsupported data type for <RandomValue>:'"+s.getType()+"'"+s.getType().equals("int"));
        						}
        					}
        					else if (s.getRandomValue().getMin()==null && s.getRandomValue().getMax()!=null){
        						if (s.getType().equals("int")){
        							try{
        								value=""+RandomPlx.getInstance().getIntBelow(floatToInt(s.getRandomValue().getMax()));	
        							}
        							catch (NumberFormatException e){
        								throw new PlexilScriptException("Invalid Plexil script:"+s.getName()+" random 'max' value should be an integer." );
        							}        								
        						}
        						else if (s.getType().equals("float")){
        							value=""+RandomPlx.getInstance().getFloatBelow(s.getRandomValue().getMax());
        						}
        						else{
        							throw new PlexilScriptException("Invalid Plexil script: unsupported data type for <RandomValue>:"+s.getType());
        						}

        					}
        					else if (s.getRandomValue().getMin()!=null && s.getRandomValue().getMax()==null){
        						
        						if (s.getType().equals("int")){
        							try{
        								value=""+RandomPlx.getInstance().getIntAbove(floatToInt(s.getRandomValue().getMin()));	
        							}
        							catch (NumberFormatException e){
        								throw new PlexilScriptException("Invalid Plexil script:"+s.getName()+" random 'max' value should be an integer." );
        							}          							
        						}
        						else if (s.getType().equals("float")){
        							value=""+RandomPlx.getInstance().getFloatAbove(s.getRandomValue().getMin());
        						} 
        						else{
        							throw new PlexilScriptException("Invalid Plexil script: unsupported data type for <RandomValue>:"+s.getType());
        						}

        					}
        					else{
        						if (s.getType().equals("int")){
        							try{
        								value=""+RandomPlx.getInstance().getInt(floatToInt(s.getRandomValue().getMin()),floatToInt(s.getRandomValue().getMax()));
        							}
        							catch (NumberFormatException e){
        								throw new PlexilScriptException("Invalid Plexil script:"+s.getName()+" random 'min' and 'max' values should be integers." );
        							} 
        							
        						}
        						else if (s.getType().equals("float")){
        							value=""+RandomPlx.getInstance().getFloat(s.getRandomValue().getMin(),s.getRandomValue().getMax());
        						}
        						else{
        							throw new PlexilScriptException("Invalid Plexil script: unsupported data type for <RandomValue>:"+s.getType());
        						}

        						
        					}
        				
        					if (statesEnum.hasMoreElements()){
            					sf.append("("+adjustExternalVariableName(s.getName())+") : v("+value+") ,");	
            				}
            				else{
            					sf.append("("+adjustExternalVariableName(s.getName())+") : v("+value+"))"+(stepsIterator.hasNext()?"":" .")+"\n");
            				} 
    					}
    					
    				}
    				else{
    					throw new PlexilScriptException("Invalid plexil script: no value or random value specified in one or more steps.");
    				}
  
    			}
    			    			
    		}
    		
    	}
    	else{
        	//if there is no context information.
        	sf.append("eq "+this.getRootNode().getNodeId()+"Env = mtcontext .\n");    		
    	}
    	
    	
    	//end of maude's module file
    	sf.append("\n\nendm\n\neof");    	 
    	
    	return sf.toString();
    }
    

    
   
    private String adjustExternalVariableName(String var){
    	//TODO verify all cases
    	if (var.contains(".")){
    		String s1=var.substring(0,var.indexOf("."));
    		String s2=var.substring(var.indexOf(".")+1);
    		return "'"+s1+" . "+"'"+s2;
    	}
    	else{
    		return "'"+var;
    	}
    }

    
    private static void generateNodeBodies(StringBuffer out, Node root){
    	out.append(root.getMaudeDeclaration()+"\n\n");
    	if (root.getChildNodes()!=null){
    		List<Node> childNodes=root.getChildNodes();    		
    		for (Node child:childNodes){
    			generateNodeBodies(out, child);
    		}
    	}
    	
    }
    
    
	public Integer floatToInt(Float f) throws NumberFormatException{
		float fv=f.floatValue();
		if ((int)fv==fv){
			return new Integer((int)fv);
		}
		else throw new NumberFormatException(f+" cannot be converted to int without precision loss");
	}
    
	public boolean isIntegerTransformable(Float f){
		return (int)f.floatValue()==f.floatValue();
	}
	
	
}
