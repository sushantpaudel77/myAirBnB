package com.projects.airbnb.controller;

import com.projects.airbnb.dto.InventoryDto;
import com.projects.airbnb.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/rooms/{roomId}")
    public ResponseEntity<List<InventoryDto> > getAllInventoryByRoom(@PathVariable Long roomId) {
        return inventoryService.getAllInventoryByRoom(roomId);
    }
}
