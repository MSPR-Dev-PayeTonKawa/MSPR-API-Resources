package com.paketonkawa.resources.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@AllArgsConstructor
@Getter
@Setter
public class MessageDTO {
    public Action action;
    public Table table;
    public Map<String, Object> information;
}
