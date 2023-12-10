package controller;

import model.StackString;

public class HistoricController {

    public HistoricController() {
        super();
    }

    public void insertAddress(StackString stack, String address) throws Exception{
        if(address.contains("http://www.") && address.contains(".com")) {
            stack.push(address);
        }else {
            throw new Exception("Invalid address");
        }
    }

    public void removeAddress(StackString stack) throws Exception{
        if(!stack.isEmpty()) {
            stack.pop();
            if(stack.isEmpty()) {
                throw new Exception("Historic is empty now");
            }

        }else {
            throw new Exception("Unable to remove as historic is empty");
        }
    }

    public String consultAddress(StackString stack) throws Exception {
        if (!stack.isEmpty()) {
            String address = stack.top();
            if (stack.size() == 1) {
                throw new Exception("This is the last address");
            }
            return address;

        } else {
            throw new Exception("Unable to consult as historic is empty");
        }
    }
    }
