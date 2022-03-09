package duke.command;

import java.util.Arrays;

import duke.Storage;
import duke.TasksList;
import duke.exception.InvalidArgumentException;

public class ReminderCommand extends Command {
    private String[] instruction;

    public ReminderCommand(String[] instruction) {
        this.instruction = instruction;
    }

    @Override
    public String execute(TasksList taskList, Storage storage) throws InvalidArgumentException {
        return taskList.getTasksUnder(Arrays.asList(instruction));
    }
}
