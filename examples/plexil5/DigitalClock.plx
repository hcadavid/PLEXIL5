  <PlexilPlan xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="http://plexil.svn.sourceforge.net/viewvc/plexil/trunk/schema/core-plexil.xsd" FileName="/Users/hcadavid/NIA/Plexil5/trunk/examples/plexil5/DigitalClock.ple">
      <Node FileName="/Users/hcadavid/NIA/Plexil5/trunk/examples/plexil5/DigitalClock.ple" LineNo="2" ColNo="1" NodeType="NodeList">
          <NodeId>DigitalClock</NodeId>
          <VariableDeclarations>
              <DeclareVariable>
                  <Name>h</Name>
                  <Type>Integer</Type>
                  <InitialValue>
                      <IntegerValue>0</IntegerValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>m</Name>
                  <Type>Integer</Type>
                  <InitialValue>
                      <IntegerValue>0</IntegerValue>
                  </InitialValue>
              </DeclareVariable>
          </VariableDeclarations>
          <NodeBody>
              <NodeList>
                  <Node FileName="/Users/hcadavid/NIA/Plexil5/trunk/examples/plexil5/DigitalClock.ple" LineNo="11" ColNo="7" NodeType="NodeList">
                      <NodeId>Clock</NodeId>
                      <RepeatCondition>
                          <EQBoolean>
                              <LookupOnChange>
                                  <Name>
                                      <StringValue>DigitalClock.Click</StringValue>
                                  </Name>
                              </LookupOnChange>
                              <BooleanValue>true</BooleanValue>
                          </EQBoolean>
                      </RepeatCondition>
                      <NodeBody>
                          <NodeList>
                              <Node FileName="/Users/hcadavid/NIA/Plexil5/trunk/examples/plexil5/DigitalClock.ple" LineNo="18" ColNo="17" NodeType="Assignment">
                                  <NodeId>H</NodeId>
                                  <VariableDeclarations>
                                      <DeclareVariable>
                                          <Name>x</Name>
                                          <Type>Integer</Type>
                                          <InitialValue>
                                              <IntegerValue>12</IntegerValue>
                                          </InitialValue>
                                      </DeclareVariable>
                                  </VariableDeclarations>
                                  <StartCondition>
                                      <EQNumeric>
                                          <IntegerVariable>m</IntegerVariable>
                                          <IntegerValue>59</IntegerValue>
                                      </EQNumeric>
                                  </StartCondition>
                                  <NodeBody>
                                      <Assignment>
                                          <IntegerVariable>h</IntegerVariable>
                                          <NumericRHS>
                                              <ADD>
                                                  <IntegerVariable>h</IntegerVariable>
                                                  <IntegerValue>1</IntegerValue>
                                              </ADD>
                                          </NumericRHS>
                                      </Assignment>
                                  </NodeBody>
                              </Node>
                              <Node FileName="/Users/hcadavid/NIA/Plexil5/trunk/examples/plexil5/DigitalClock.ple" LineNo="25" ColNo="17" NodeType="Assignment">
                                  <NodeId>M1</NodeId>
                                  <VariableDeclarations>
                                      <DeclareVariable>
                                          <Name>x</Name>
                                          <Type>Integer</Type>
                                          <InitialValue>
                                              <IntegerValue>5</IntegerValue>
                                          </InitialValue>
                                      </DeclareVariable>
                                  </VariableDeclarations>
                                  <RepeatCondition>
                                      <LT>
                                          <IntegerVariable>m</IntegerVariable>
                                          <IntegerValue>59</IntegerValue>
                                      </LT>
                                  </RepeatCondition>
                                  <NodeBody>
                                      <Assignment>
                                          <IntegerVariable>m</IntegerVariable>
                                          <NumericRHS>
                                              <ADD>
                                                  <IntegerVariable>m</IntegerVariable>
                                                  <IntegerVariable>x</IntegerVariable>
                                              </ADD>
                                          </NumericRHS>
                                      </Assignment>
                                  </NodeBody>
                              </Node>
                              <Node FileName="/Users/hcadavid/NIA/Plexil5/trunk/examples/plexil5/DigitalClock.ple" LineNo="32" ColNo="17" NodeType="Assignment">
                                  <NodeId>M2</NodeId>
                                  <StartCondition>
                                      <EQNumeric>
                                          <IntegerVariable>m</IntegerVariable>
                                          <IntegerValue>59</IntegerValue>
                                      </EQNumeric>
                                  </StartCondition>
                                  <NodeBody>
                                      <Assignment>
                                          <IntegerVariable>m</IntegerVariable>
                                          <NumericRHS>
                                              <IntegerValue>0</IntegerValue>
                                          </NumericRHS>
                                      </Assignment>
                                  </NodeBody>
                              </Node>
                          </NodeList>
                      </NodeBody>
                  </Node>
              </NodeList>
          </NodeBody>
      </Node>
  </PlexilPlan>
