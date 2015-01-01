////////////////////////////////////////////////////////////////////////////////////////////////////
// PlotSquared - A plot manager and world generator for the Bukkit API                             /
// Copyright (c) 2014 IntellectualSites/IntellectualCrafters                                       /
//                                                                                                 /
// This program is free software; you can redistribute it and/or modify                            /
// it under the terms of the GNU General Public License as published by                            /
// the Free Software Foundation; either version 3 of the License, or                               /
// (at your option) any later version.                                                             /
//                                                                                                 /
// This program is distributed in the hope that it will be useful,                                 /
// but WITHOUT ANY WARRANTY; without even the implied warranty of                                  /
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the                                   /
// GNU General Public License for more details.                                                    /
//                                                                                                 /
// You should have received a copy of the GNU General Public License                               /
// along with this program; if not, write to the Free Software Foundation,                         /
// Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301  USA                               /
//                                                                                                 /
// You can contact us via: support@intellectualsites.com                                           /
////////////////////////////////////////////////////////////////////////////////////////////////////

package com.intellectualcrafters.unused;

import java.util.UUID;

/**
 * @author Citymonstret
 */
public class UUIDSet {

    /**
     * Player Name
     */
    private final String name;

    /**
     * Player UUID
     */
    private final UUID uuid;

    /**
     * Constructor
     *
     * @param name Username
     * @param uuid UUID
     */
    public UUIDSet(final String name, final UUID uuid) {
        this.name = name;
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return getName();
    }

    /**
     * Return the name
     *
     * @return Name
     */
    public String getName() {
        return this.name;
    }

    public UUID getUUID() {
        return this.uuid;
    }
}