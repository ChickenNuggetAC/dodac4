package net.forger.dreamsofdivinity.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import net.forger.dreamsofdivinity.network.DreamsOfDivinityModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class VariablesSetProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.water = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water1;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.water = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water2;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.water = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water3;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.water = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water4;
							_vars.syncPlayerVariables(entity);
						}
					} else {
						if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.water = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water5;
								_vars.syncPlayerVariables(entity);
							}
						} else {
							if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
								{
									DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
									_vars.water = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).water6;
									_vars.syncPlayerVariables(entity);
								}
							}
						}
					}
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.fire = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire1;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.fire = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire2;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.fire = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire3;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.fire = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire4;
							_vars.syncPlayerVariables(entity);
						}
					} else {
						if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.fire = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire5;
								_vars.syncPlayerVariables(entity);
							}
						} else {
							if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
								{
									DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
									_vars.fire = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).fire6;
									_vars.syncPlayerVariables(entity);
								}
							}
						}
					}
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicstyle = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicstyle1;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicstyle = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicstyle2;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.magicstyle = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicstyle3;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.magicstyle = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicstyle4;
							_vars.syncPlayerVariables(entity);
						}
					} else {
						if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.magicstyle = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicstyle5;
								_vars.syncPlayerVariables(entity);
							}
						} else {
							if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
								{
									DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
									_vars.magicstyle = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicstyle6;
									_vars.syncPlayerVariables(entity);
								}
							}
						}
					}
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicpower = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower1;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicpower = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower2;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.magicpower = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower3;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.magicpower = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower4;
							_vars.syncPlayerVariables(entity);
						}
					} else {
						if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.magicpower = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower5;
								_vars.syncPlayerVariables(entity);
							}
						} else {
							if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
								{
									DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
									_vars.magicpower = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicpower6;
									_vars.syncPlayerVariables(entity);
								}
							}
						}
					}
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicspeed = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed1;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicspeed = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed2;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.magicspeed = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed3;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.magicspeed = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed4;
							_vars.syncPlayerVariables(entity);
						}
					} else {
						if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.magicspeed = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed5;
								_vars.syncPlayerVariables(entity);
							}
						} else {
							if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
								{
									DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
									_vars.magicspeed = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed6;
									_vars.syncPlayerVariables(entity);
								}
							}
						}
					}
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicsize = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize1;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicsize = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize2;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.magicsize = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize3;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.magicsize = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize4;
							_vars.syncPlayerVariables(entity);
						}
					} else {
						if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.magicsize = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize5;
								_vars.syncPlayerVariables(entity);
							}
						} else {
							if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
								{
									DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
									_vars.magicsize = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicsize6;
									_vars.syncPlayerVariables(entity);
								}
							}
						}
					}
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.overheat = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat1;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.overheat = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat2;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.overheat = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat3;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.overheat = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat4;
							_vars.syncPlayerVariables(entity);
						}
					} else {
						if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.overheat = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat5;
								_vars.syncPlayerVariables(entity);
							}
						} else {
							if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
								{
									DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
									_vars.overheat = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).overheat6;
									_vars.syncPlayerVariables(entity);
								}
							}
						}
					}
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.Piercing = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Piercing1;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.Piercing = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Piercing2;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.Piercing = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Piercing3;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.Piercing = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Piercing4;
							_vars.syncPlayerVariables(entity);
						}
					} else {
						if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.Piercing = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Piercing5;
								_vars.syncPlayerVariables(entity);
							}
						} else {
							if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
								{
									DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
									_vars.Piercing = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Piercing6;
									_vars.syncPlayerVariables(entity);
								}
							}
						}
					}
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.Tracking = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking1;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.Tracking = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking2;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.Tracking = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking3;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.Tracking = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking4;
							_vars.syncPlayerVariables(entity);
						}
					} else {
						if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.Tracking = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking5;
								_vars.syncPlayerVariables(entity);
							}
						} else {
							if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
								{
									DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
									_vars.Tracking = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).Tracking6;
									_vars.syncPlayerVariables(entity);
								}
							}
						}
					}
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.MagicShape = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicShape1;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.MagicShape = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicShape2;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.MagicShape = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicShape3;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.MagicShape = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicShape4;
							_vars.syncPlayerVariables(entity);
						}
					} else {
						if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.MagicShape = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicShape5;
								_vars.syncPlayerVariables(entity);
							}
						} else {
							if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
								{
									DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
									_vars.MagicShape = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicShape6;
									_vars.syncPlayerVariables(entity);
								}
							}
						}
					}
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.MagicFollowSetting = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting1;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.MagicFollowSetting = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting2;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.MagicFollowSetting = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting3;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.MagicFollowSetting = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting4;
							_vars.syncPlayerVariables(entity);
						}
					} else {
						if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.MagicFollowSetting = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting5;
								_vars.syncPlayerVariables(entity);
							}
						} else {
							if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
								{
									DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
									_vars.MagicFollowSetting = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicFollowSetting6;
									_vars.syncPlayerVariables(entity);
								}
							}
						}
					}
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.MagicDuration = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicDuration1;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.MagicDuration = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicDuration2;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.MagicDuration = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicDuration3;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.MagicDuration = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicDuration4;
							_vars.syncPlayerVariables(entity);
						}
					} else {
						if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.MagicDuration = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicDuration5;
								_vars.syncPlayerVariables(entity);
							}
						} else {
							if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
								{
									DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
									_vars.MagicDuration = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MagicDuration6;
									_vars.syncPlayerVariables(entity);
								}
							}
						}
					}
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.areacoverage = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).areacoverage1;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.areacoverage = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).areacoverage2;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.areacoverage = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).areacoverage3;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.areacoverage = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).areacoverage4;
							_vars.syncPlayerVariables(entity);
						}
					} else {
						if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.areacoverage = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).areacoverage5;
								_vars.syncPlayerVariables(entity);
							}
						} else {
							if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
								{
									DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
									_vars.areacoverage = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).areacoverage6;
									_vars.syncPlayerVariables(entity);
								}
							}
						}
					}
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.gravity = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).gravity1;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.gravity = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).gravity2;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.gravity = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).gravity3;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.gravity = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).gravity4;
							_vars.syncPlayerVariables(entity);
						}
					} else {
						if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.gravity = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).gravity5;
								_vars.syncPlayerVariables(entity);
							}
						} else {
							if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
								{
									DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
									_vars.gravity = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).gravity6;
									_vars.syncPlayerVariables(entity);
								}
							}
						}
					}
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.guidedmagic = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).guidedmagic1;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.guidedmagic = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).guidedmagic2;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.guidedmagic = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).guidedmagic3;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.guidedmagic = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).guidedmagic4;
							_vars.syncPlayerVariables(entity);
						}
					} else {
						if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.guidedmagic = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).guidedmagic5;
								_vars.syncPlayerVariables(entity);
							}
						} else {
							if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
								{
									DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
									_vars.guidedmagic = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).guidedmagic6;
									_vars.syncPlayerVariables(entity);
								}
							}
						}
					}
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.castingoffset = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).castingoffset1;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.castingoffset = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).castingoffset2;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.castingoffset = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).castingoffset3;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.castingoffset = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).castingoffset4;
							_vars.syncPlayerVariables(entity);
						}
					} else {
						if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.castingoffset = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).castingoffset5;
								_vars.syncPlayerVariables(entity);
							}
						} else {
							if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
								{
									DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
									_vars.castingoffset = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).castingoffset6;
									_vars.syncPlayerVariables(entity);
								}
							}
						}
					}
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.magicdirection = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection1;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicdirection = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection2;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.magicdirection = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection3;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.magicdirection = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection4;
							_vars.syncPlayerVariables(entity);
						}
					} else {
						if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.magicdirection = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection5;
								_vars.syncPlayerVariables(entity);
							}
						} else {
							if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
								{
									DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
									_vars.magicdirection = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicdirection6;
									_vars.syncPlayerVariables(entity);
								}
							}
						}
					}
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 1) {
			{
				DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
				_vars.MultiCast = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MultiCast1;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 2) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.MultiCast = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MultiCast2;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 3) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.MultiCast = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MultiCast3;
						_vars.syncPlayerVariables(entity);
					}
				} else {
					if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 4) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.MultiCast = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MultiCast4;
							_vars.syncPlayerVariables(entity);
						}
					} else {
						if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 5) {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.MultiCast = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MultiCast5;
								_vars.syncPlayerVariables(entity);
							}
						} else {
							if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).spell == 6) {
								{
									DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
									_vars.MultiCast = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).MultiCast6;
									_vars.syncPlayerVariables(entity);
								}
							}
						}
					}
				}
			}
		}
		if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicstyle1 == 1) {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed1 < -0.1) {
				{
					DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
					_vars.magicspeed1 = 0;
					_vars.syncPlayerVariables(entity);
				}
			}
		} else {
			if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicstyle2 == 1) {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed2 < -0.1) {
					{
						DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
						_vars.magicspeed2 = 0;
						_vars.syncPlayerVariables(entity);
					}
				}
			} else {
				if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicstyle3 == 1) {
					if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed3 < -0.1) {
						{
							DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
							_vars.magicspeed3 = 0;
							_vars.syncPlayerVariables(entity);
						}
					}
				} else {
					if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicstyle4 == 1) {
						if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed4 < -0.1) {
							{
								DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
								_vars.magicspeed4 = 0;
								_vars.syncPlayerVariables(entity);
							}
						}
					} else {
						if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicstyle5 == 1) {
							if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed5 < -0.1) {
								{
									DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
									_vars.magicspeed5 = 0;
									_vars.syncPlayerVariables(entity);
								}
							}
						} else {
							if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicstyle6 == 1) {
								if (entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES).magicspeed6 < -0.1) {
									{
										DreamsOfDivinityModVariables.PlayerVariables _vars = entity.getData(DreamsOfDivinityModVariables.PLAYER_VARIABLES);
										_vars.magicspeed6 = 0;
										_vars.syncPlayerVariables(entity);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}