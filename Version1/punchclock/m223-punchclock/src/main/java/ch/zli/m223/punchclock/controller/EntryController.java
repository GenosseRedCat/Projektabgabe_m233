package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Entry;
import ch.zli.m223.punchclock.service.EntryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/entries")
public class EntryController {
    private EntryService entryService;

    public EntryController(EntryService entryService) {
        this.entryService = entryService;
    }

    @GetMapping //Holt Eintrag
    @ResponseStatus(HttpStatus.OK)
    public List<Entry> getAllEntries() {
        return entryService.findAll();
    }

    //erstellt neuen Eintrag
    @PostMapping //Postet neuen Eintrag
    @ResponseStatus(HttpStatus.CREATED)
    public Entry createEntry(@Valid @RequestBody Entry entry) {
        return entryService.createEntry(entry);
    }











    //löscht vorhandenen Eintrag via ID
    //@RequestMapping(method = RequestMethod.DELETE, value="/entries/{id}")

    @DeleteMapping("/entries/{id}")
    @ResponseBody
    public void deleteEntry(@PathVariable Long id) {
        entryService.deleteEntry(id);
    }
/*
    @DeleteMapping("/entries/{id}")
    @ResponseBody
    public void updateEntry(@PathVariable Long id) {
        entryService.updateEntry(id);
    }


    @ResponseStatus(HttpStatus.OK)
    public void deleteEntry(@Valid @PathVariable Entry entry) {
        entryService.deleteEntry(entry);
    }*/


}

