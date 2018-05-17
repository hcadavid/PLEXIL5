  <PlexilPlan xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="http://plexil.svn.sourceforge.net/viewvc/plexil/trunk/schema/extended-plexil.xsd" FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple">
      <Concurrence FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="7" ColNo="1">
          <NodeId>cruisecontrol</NodeId>
          <VariableDeclarations>
              <DeclareVariable>
                  <Name>INIT_DISTANCE</Name>
                  <Type>Integer</Type>
                  <InitialValue>
                      <IntegerValue>55</IntegerValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>BEGIN_RAMP</Name>
                  <Type>Integer</Type>
                  <InitialValue>
                      <IntegerValue>33</IntegerValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>END_RAMP</Name>
                  <Type>Integer</Type>
                  <InitialValue>
                      <IntegerValue>25</IntegerValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>AT_INTERSECTION</Name>
                  <Type>Integer</Type>
                  <InitialValue>
                      <IntegerValue>0</IntegerValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>timestep</Name>
                  <Type>Integer</Type>
                  <InitialValue>
                      <IntegerValue>1</IntegerValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>SEMAPHORE_CYCLE</Name>
                  <Type>Integer</Type>
                  <InitialValue>
                      <IntegerValue>28</IntegerValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>GREEN_LIGHT</Name>
                  <Type>Integer</Type>
                  <InitialValue>
                      <IntegerValue>28</IntegerValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>YELLOW_LIGHT</Name>
                  <Type>Integer</Type>
                  <InitialValue>
                      <IntegerValue>12</IntegerValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>RED_LIGHT</Name>
                  <Type>Integer</Type>
                  <InitialValue>
                      <IntegerValue>8</IntegerValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>STOPPED</Name>
                  <Type>Integer</Type>
                  <InitialValue>
                      <IntegerValue>0</IntegerValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>SLOW</Name>
                  <Type>Integer</Type>
                  <InitialValue>
                      <IntegerValue>1</IntegerValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>MODERATE</Name>
                  <Type>Integer</Type>
                  <InitialValue>
                      <IntegerValue>2</IntegerValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>FAST</Name>
                  <Type>Integer</Type>
                  <InitialValue>
                      <IntegerValue>3</IntegerValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>DESIRED</Name>
                  <Type>Integer</Type>
                  <InitialValue>
                      <IntegerValue>2</IntegerValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>A_distance</Name>
                  <Type>Integer</Type>
                  <InitialValue>
                      <IntegerValue>55</IntegerValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>A_speed</Name>
                  <Type>Integer</Type>
                  <InitialValue>
                      <IntegerValue>1</IntegerValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>A_acceleration</Name>
                  <Type>Integer</Type>
                  <InitialValue>
                      <IntegerValue>0</IntegerValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>A_semaphore_counter</Name>
                  <Type>Integer</Type>
                  <InitialValue>
                      <IntegerValue>28</IntegerValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>cruise_enabled</Name>
                  <Type>Boolean</Type>
                  <InitialValue>
                      <BooleanValue>false</BooleanValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>cruise_speed</Name>
                  <Type>Integer</Type>
                  <InitialValue>
                      <IntegerValue>0</IntegerValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>merging_traffic</Name>
                  <Type>Boolean</Type>
                  <InitialValue>
                      <BooleanValue>true</BooleanValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>let_behind</Name>
                  <Type>Boolean</Type>
                  <InitialValue>
                      <BooleanValue>true</BooleanValue>
                  </InitialValue>
              </DeclareVariable>
              <DeclareVariable>
                  <Name>roll_stop</Name>
                  <Type>Boolean</Type>
                  <InitialValue>
                      <BooleanValue>true</BooleanValue>
                  </InitialValue>
              </DeclareVariable>
          </VariableDeclarations>
          <InvariantCondition>
              <NOT>
                  <AND>
                      <EQNumeric>
                          <IntegerVariable>A_distance</IntegerVariable>
                          <IntegerVariable>AT_INTERSECTION</IntegerVariable>
                      </EQNumeric>
                      <GT>
                          <IntegerVariable>A_speed</IntegerVariable>
                          <IntegerVariable>STOPPED</IntegerVariable>
                      </GT>
                  </AND>
              </NOT>
          </InvariantCondition>
          <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="64" ColNo="3" NodeType="Assignment">
              <NodeId>Car</NodeId>
              <RepeatCondition>
                  <AND>
                      <GT>
                          <IntegerVariable>A_distance</IntegerVariable>
                          <IntegerVariable>AT_INTERSECTION</IntegerVariable>
                      </GT>
                      <GT>
                          <IntegerVariable>A_speed</IntegerVariable>
                          <IntegerValue>0</IntegerValue>
                      </GT>
                  </AND>
              </RepeatCondition>
              <NodeBody>
                  <Assignment>
                      <IntegerVariable>A_distance</IntegerVariable>
                      <NumericRHS>
                          <SUB>
                              <IntegerVariable>A_distance</IntegerVariable>
                              <MUL>
                                  <IntegerVariable>A_speed</IntegerVariable>
                                  <IntegerVariable>timestep</IntegerVariable>
                              </MUL>
                          </SUB>
                      </NumericRHS>
                  </Assignment>
              </NodeBody>
          </Node>
          <Sequence FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="75" ColNo="3">
              <NodeId>Driver</NodeId>
              <Concurrence FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="79" ColNo="5">
                  <NodeId>DriveToRamp</NodeId>
                  <StartCondition>
                      <GT>
                          <IntegerVariable>A_distance</IntegerVariable>
                          <IntegerVariable>BEGIN_RAMP</IntegerVariable>
                      </GT>
                  </StartCondition>
                  <RepeatCondition>
                      <GT>
                          <IntegerVariable>A_distance</IntegerVariable>
                          <IntegerVariable>BEGIN_RAMP</IntegerVariable>
                      </GT>
                  </RepeatCondition>
                  <Concurrence FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="86" ColNo="7">
                      <NodeId>SetDesiredCruise</NodeId>
                      <SkipCondition>
                          <NOT>
                              <AND>
                                  <EQNumeric>
                                      <IntegerVariable>A_speed</IntegerVariable>
                                      <IntegerVariable>DESIRED</IntegerVariable>
                                  </EQNumeric>
                                  <EQBoolean>
                                      <BooleanVariable>cruise_enabled</BooleanVariable>
                                      <BooleanValue>false</BooleanValue>
                                  </EQBoolean>
                              </AND>
                          </NOT>
                      </SkipCondition>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="89" ColNo="25" NodeType="Assignment">
                          <NodeId>EnableCruise</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <BooleanVariable>cruise_enabled</BooleanVariable>
                                  <BooleanRHS>
                                      <BooleanValue>true</BooleanValue>
                                  </BooleanRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="90" ColNo="25" NodeType="Assignment">
                          <NodeId>SetCruiseSpeed</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <IntegerVariable>cruise_speed</IntegerVariable>
                                  <NumericRHS>
                                      <IntegerVariable>A_speed</IntegerVariable>
                                  </NumericRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="91" ColNo="25" NodeType="Assignment">
                          <NodeId>NoAcceleration</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <IntegerVariable>A_acceleration</IntegerVariable>
                                  <NumericRHS>
                                      <IntegerValue>0</IntegerValue>
                                  </NumericRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                  </Concurrence>
                  <Concurrence FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="94" ColNo="7">
                      <NodeId>MaintainSpeed</NodeId>
                      <SkipCondition>
                          <NOT>
                              <AND>
                                  <AND>
                                      <EQNumeric>
                                          <IntegerVariable>A_speed</IntegerVariable>
                                          <IntegerVariable>DESIRED</IntegerVariable>
                                      </EQNumeric>
                                      <EQBoolean>
                                          <BooleanVariable>cruise_enabled</BooleanVariable>
                                          <BooleanValue>true</BooleanValue>
                                      </EQBoolean>
                                  </AND>
                                  <EQNumeric>
                                      <IntegerVariable>cruise_speed</IntegerVariable>
                                      <IntegerVariable>DESIRED</IntegerVariable>
                                  </EQNumeric>
                              </AND>
                          </NOT>
                      </SkipCondition>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="97" ColNo="25" NodeType="Assignment">
                          <NodeId>AtDesiredSpeed</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <IntegerVariable>A_speed</IntegerVariable>
                                  <NumericRHS>
                                      <IntegerVariable>DESIRED</IntegerVariable>
                                  </NumericRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="98" ColNo="25" NodeType="Assignment">
                          <NodeId>ConstantSpeed</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <IntegerVariable>A_acceleration</IntegerVariable>
                                  <NumericRHS>
                                      <IntegerValue>0</IntegerValue>
                                  </NumericRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                  </Concurrence>
                  <Concurrence FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="101" ColNo="7">
                      <NodeId>IncreaseSpeed</NodeId>
                      <SkipCondition>
                          <NOT>
                              <LT>
                                  <IntegerVariable>A_speed</IntegerVariable>
                                  <IntegerVariable>DESIRED</IntegerVariable>
                              </LT>
                          </NOT>
                      </SkipCondition>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="104" ColNo="28" NodeType="Assignment">
                          <NodeId>IncSpeed2Cruise</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <IntegerVariable>A_speed</IntegerVariable>
                                  <NumericRHS>
                                      <ADD>
                                          <IntegerVariable>A_speed</IntegerVariable>
                                          <IntegerValue>1</IntegerValue>
                                      </ADD>
                                  </NumericRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="105" ColNo="28" NodeType="Assignment">
                          <NodeId>Accelerate2Cruise</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <IntegerVariable>A_acceleration</IntegerVariable>
                                  <NumericRHS>
                                      <IntegerValue>1</IntegerValue>
                                  </NumericRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                  </Concurrence>
                  <Concurrence FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="108" ColNo="7">
                      <NodeId>DecreaseSpeed</NodeId>
                      <SkipCondition>
                          <NOT>
                              <GT>
                                  <IntegerVariable>A_speed</IntegerVariable>
                                  <IntegerVariable>DESIRED</IntegerVariable>
                              </GT>
                          </NOT>
                      </SkipCondition>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="111" ColNo="28" NodeType="Assignment">
                          <NodeId>DecSpeed2Cruise</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <IntegerVariable>A_speed</IntegerVariable>
                                  <NumericRHS>
                                      <SUB>
                                          <IntegerVariable>A_speed</IntegerVariable>
                                          <IntegerValue>1</IntegerValue>
                                      </SUB>
                                  </NumericRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="112" ColNo="28" NodeType="Assignment">
                          <NodeId>Decelerate2Cruise</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <IntegerVariable>A_acceleration</IntegerVariable>
                                  <NumericRHS>
                                      <IntegerValue>-1</IntegerValue>
                                  </NumericRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                  </Concurrence>
              </Concurrence>
              <Concurrence FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="117" ColNo="5">
                  <NodeId>AvoidTraffic</NodeId>
                  <StartCondition>
                      <AND>
                          <LE>
                              <IntegerVariable>END_RAMP</IntegerVariable>
                              <IntegerVariable>A_distance</IntegerVariable>
                          </LE>
                          <LE>
                              <IntegerVariable>A_distance</IntegerVariable>
                              <IntegerVariable>BEGIN_RAMP</IntegerVariable>
                          </LE>
                      </AND>
                  </StartCondition>
                  <Concurrence FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="122" ColNo="7">
                      <NodeId>LetBehind</NodeId>
                      <SkipCondition>
                          <NOT>
                              <AND>
                                  <BooleanVariable>merging_traffic</BooleanVariable>
                                  <BooleanVariable>let_behind</BooleanVariable>
                              </AND>
                          </NOT>
                      </SkipCondition>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="125" ColNo="27" NodeType="Assignment">
                          <NodeId>IncSpeedAtRamp</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <IntegerVariable>A_speed</IntegerVariable>
                                  <NumericRHS>
                                      <ADD>
                                          <IntegerVariable>A_speed</IntegerVariable>
                                          <IntegerValue>1</IntegerValue>
                                      </ADD>
                                  </NumericRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="126" ColNo="27" NodeType="Assignment">
                          <NodeId>AccelerateAtRamp</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <IntegerVariable>A_acceleration</IntegerVariable>
                                  <NumericRHS>
                                      <IntegerValue>1</IntegerValue>
                                  </NumericRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                  </Concurrence>
                  <Concurrence FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="129" ColNo="7">
                      <NodeId>LetAhead</NodeId>
                      <SkipCondition>
                          <NOT>
                              <AND>
                                  <BooleanVariable>merging_traffic</BooleanVariable>
                                  <NOT>
                                      <BooleanVariable>let_behind</BooleanVariable>
                                  </NOT>
                              </AND>
                          </NOT>
                      </SkipCondition>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="132" ColNo="27" NodeType="Assignment">
                          <NodeId>DecSpeedAtRamp</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <IntegerVariable>A_speed</IntegerVariable>
                                  <NumericRHS>
                                      <SUB>
                                          <IntegerVariable>A_speed</IntegerVariable>
                                          <IntegerValue>1</IntegerValue>
                                      </SUB>
                                  </NumericRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="133" ColNo="27" NodeType="Assignment">
                          <NodeId>DecelerateAtRamp</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <IntegerVariable>A_acceleration</IntegerVariable>
                                  <NumericRHS>
                                      <IntegerValue>-1</IntegerValue>
                                  </NumericRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                  </Concurrence>
                  <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="136" ColNo="7" NodeType="Assignment">
                      <NodeId>NoTraffic</NodeId>
                      <SkipCondition>
                          <BooleanVariable>merging_traffic</BooleanVariable>
                      </SkipCondition>
                      <NodeBody>
                          <Assignment>
                              <IntegerVariable>A_acceleration</IntegerVariable>
                              <NumericRHS>
                                  <IntegerValue>0</IntegerValue>
                              </NumericRHS>
                          </Assignment>
                      </NodeBody>
                  </Node>
              </Concurrence>
              <Concurrence FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="143" ColNo="5">
                  <NodeId>StopAtLight</NodeId>
                  <StartCondition>
                      <AND>
                          <LT>
                              <IntegerVariable>AT_INTERSECTION</IntegerVariable>
                              <IntegerVariable>A_distance</IntegerVariable>
                          </LT>
                          <LT>
                              <IntegerVariable>A_distance</IntegerVariable>
                              <IntegerVariable>END_RAMP</IntegerVariable>
                          </LT>
                      </AND>
                  </StartCondition>
                  <RepeatCondition>
                      <AND>
                          <GT>
                              <IntegerVariable>A_distance</IntegerVariable>
                              <IntegerVariable>AT_INTERSECTION</IntegerVariable>
                          </GT>
                          <GT>
                              <IntegerVariable>A_speed</IntegerVariable>
                              <IntegerValue>0</IntegerValue>
                          </GT>
                      </AND>
                  </RepeatCondition>
                  <Concurrence FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="149" ColNo="7">
                      <NodeId>Roll</NodeId>
                      <SkipCondition>
                          <NOT>
                              <AND>
                                  <AND>
                                      <BooleanVariable>cruise_enabled</BooleanVariable>
                                      <GT>
                                          <IntegerVariable>A_speed</IntegerVariable>
                                          <IntegerVariable>cruise_speed</IntegerVariable>
                                      </GT>
                                  </AND>
                                  <BooleanVariable>roll_stop</BooleanVariable>
                              </AND>
                          </NOT>
                      </SkipCondition>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="152" ColNo="30" NodeType="Assignment">
                          <NodeId>RollDecSpeed</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <IntegerVariable>A_speed</IntegerVariable>
                                  <NumericRHS>
                                      <SUB>
                                          <IntegerVariable>A_speed</IntegerVariable>
                                          <IntegerValue>1</IntegerValue>
                                      </SUB>
                                  </NumericRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="153" ColNo="30" NodeType="Assignment">
                          <NodeId>RollDecelerate</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <IntegerVariable>A_acceleration</IntegerVariable>
                                  <NumericRHS>
                                      <IntegerValue>-1</IntegerValue>
                                  </NumericRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                  </Concurrence>
                  <Concurrence FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="156" ColNo="7">
                      <NodeId>Break</NodeId>
                      <SkipCondition>
                          <NOT>
                              <AND>
                                  <AND>
                                      <BooleanVariable>cruise_enabled</BooleanVariable>
                                      <GT>
                                          <IntegerVariable>A_speed</IntegerVariable>
                                          <IntegerVariable>cruise_speed</IntegerVariable>
                                      </GT>
                                  </AND>
                                  <NOT>
                                      <BooleanVariable>roll_stop</BooleanVariable>
                                  </NOT>
                              </AND>
                          </NOT>
                      </SkipCondition>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="159" ColNo="26" NodeType="Assignment">
                          <NodeId>PressBreakPedal</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <IntegerVariable>A_speed</IntegerVariable>
                                  <NumericRHS>
                                      <SUB>
                                          <IntegerVariable>A_speed</IntegerVariable>
                                          <IntegerValue>1</IntegerValue>
                                      </SUB>
                                  </NumericRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="160" ColNo="26" NodeType="Assignment">
                          <NodeId>BreakDecelerate</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <IntegerVariable>A_acceleration</IntegerVariable>
                                  <NumericRHS>
                                      <IntegerValue>-1</IntegerValue>
                                  </NumericRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="161" ColNo="26" NodeType="Assignment">
                          <NodeId>BreakDisengage</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <BooleanVariable>cruise_enabled</BooleanVariable>
                                  <BooleanRHS>
                                      <BooleanValue>false</BooleanValue>
                                  </BooleanRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                  </Concurrence>
                  <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="164" ColNo="7" NodeType="Assignment">
                      <NodeId>CruiseOn</NodeId>
                      <SkipCondition>
                          <NOT>
                              <AND>
                                  <AND>
                                      <BooleanVariable>cruise_enabled</BooleanVariable>
                                      <EQNumeric>
                                          <IntegerVariable>A_speed</IntegerVariable>
                                          <IntegerVariable>cruise_speed</IntegerVariable>
                                      </EQNumeric>
                                  </AND>
                                  <LT>
                                      <IntegerVariable>A_acceleration</IntegerVariable>
                                      <IntegerValue>0</IntegerValue>
                                  </LT>
                              </AND>
                          </NOT>
                      </SkipCondition>
                      <NodeBody>
                          <Assignment>
                              <IntegerVariable>A_acceleration</IntegerVariable>
                              <NumericRHS>
                                  <IntegerValue>0</IntegerValue>
                              </NumericRHS>
                          </Assignment>
                      </NodeBody>
                  </Node>
                  <Concurrence FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="169" ColNo="7">
                      <NodeId>BreakLate</NodeId>
                      <SkipCondition>
                          <NOT>
                              <AND>
                                  <AND>
                                      <BooleanVariable>cruise_enabled</BooleanVariable>
                                      <LE>
                                          <IntegerVariable>A_speed</IntegerVariable>
                                          <IntegerVariable>cruise_speed</IntegerVariable>
                                      </LE>
                                  </AND>
                                  <NOT>
                                      <LT>
                                          <IntegerVariable>A_acceleration</IntegerVariable>
                                          <IntegerValue>0</IntegerValue>
                                      </LT>
                                  </NOT>
                              </AND>
                          </NOT>
                      </SkipCondition>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="172" ColNo="26" NodeType="Assignment">
                          <NodeId>PressPedalLate</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <IntegerVariable>A_speed</IntegerVariable>
                                  <NumericRHS>
                                      <SUB>
                                          <IntegerVariable>A_speed</IntegerVariable>
                                          <IntegerValue>1</IntegerValue>
                                      </SUB>
                                  </NumericRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="173" ColNo="26" NodeType="Assignment">
                          <NodeId>DecelerateLate</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <IntegerVariable>A_acceleration</IntegerVariable>
                                  <NumericRHS>
                                      <IntegerValue>-1</IntegerValue>
                                  </NumericRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="174" ColNo="26" NodeType="Assignment">
                          <NodeId>DisengageLate</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <BooleanVariable>cruise_enabled</BooleanVariable>
                                  <BooleanRHS>
                                      <BooleanValue>false</BooleanValue>
                                  </BooleanRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                  </Concurrence>
                  <Concurrence FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="177" ColNo="7">
                      <NodeId>NoCruiseSlowdown</NodeId>
                      <SkipCondition>
                          <NOT>
                              <AND>
                                  <NOT>
                                      <BooleanVariable>cruise_enabled</BooleanVariable>
                                  </NOT>
                                  <GT>
                                      <IntegerVariable>A_speed</IntegerVariable>
                                      <IntegerValue>0</IntegerValue>
                                  </GT>
                              </AND>
                          </NOT>
                      </SkipCondition>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="180" ColNo="26" NodeType="Assignment">
                          <NodeId>SlowDecSpeed</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <IntegerVariable>A_speed</IntegerVariable>
                                  <NumericRHS>
                                      <SUB>
                                          <IntegerVariable>A_speed</IntegerVariable>
                                          <IntegerValue>1</IntegerValue>
                                      </SUB>
                                  </NumericRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                      <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="181" ColNo="26" NodeType="Assignment">
                          <NodeId>SlowDecelerate</NodeId>
                          <NodeBody>
                              <Assignment>
                                  <IntegerVariable>A_acceleration</IntegerVariable>
                                  <NumericRHS>
                                      <IntegerValue>-1</IntegerValue>
                                  </NumericRHS>
                              </Assignment>
                          </NodeBody>
                      </Node>
                  </Concurrence>
              </Concurrence>
          </Sequence>
          <Node FileName="/Users/hcadavid/NIA/PLEXIL5/examples/cesar/cruisecontrol.ple" LineNo="191" ColNo="3" NodeType="Assignment">
              <NodeId>Semaphore</NodeId>
              <RepeatCondition>
                  <GT>
                      <IntegerVariable>A_semaphore_counter</IntegerVariable>
                      <IntegerValue>0</IntegerValue>
                  </GT>
              </RepeatCondition>
              <NodeBody>
                  <Assignment>
                      <IntegerVariable>A_semaphore_counter</IntegerVariable>
                      <NumericRHS>
                          <SUB>
                              <IntegerVariable>A_semaphore_counter</IntegerVariable>
                              <IntegerVariable>timestep</IntegerVariable>
                          </SUB>
                      </NumericRHS>
                  </Assignment>
              </NodeBody>
          </Node>
      </Concurrence>
  </PlexilPlan>
