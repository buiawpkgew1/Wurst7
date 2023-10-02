/*
 * Copyright (c) 2014-2023 Wurst-Imperium and contributors.
 *
 * This source code is subject to the terms of the GNU General Public
 * License, version 3. If a copy of the GPL was not distributed with this
 * file, You can obtain one at: https://www.gnu.org/licenses/gpl-3.0.txt
 */
package net.wurstclient.mixinterface;

import net.minecraft.client.session.Session;

public interface IMinecraftClient
{
	public IClientPlayerInteractionManager getInteractionManager();
	
	public ILanguageManager getLanguageManager();
	
	public IClientPlayerEntity getPlayer();
	
	public IWorld getWorld();
	
	public void setSession(Session session);
}
