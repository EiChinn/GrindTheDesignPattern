package com.eichinn.command.extension.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ei_chinn on 2017/5/31.
 */
public class CommandQueue {
    private static final String FILE_NAME = "cmdqueue.txt";
    private static List<Command> cmds = null;
    static {
        cmds = FileOpeUtils.readFile(FILE_NAME);
        if (cmds == null) {
            cmds = new ArrayList<>();
        }
    }

    public static synchronized void addCmd(MenuCommand menu) {
        cmds.addAll(menu.getMenu());
        FileOpeUtils.writeFile(FILE_NAME, cmds);
    }

    public static synchronized Command getOneCommand() {
        Command command = null;
        if (cmds.size() > 0) {
            command = cmds.get(0);
            cmds.remove(0);
            FileOpeUtils.writeFile(FILE_NAME, cmds);
        }
        return command;
    }

}
