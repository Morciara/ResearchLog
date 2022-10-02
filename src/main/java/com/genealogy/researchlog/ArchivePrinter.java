package com.genealogy.researchlog;

import com.genealogy.researchlog.model.ArchiveInformation;

import java.util.List;

public class ArchivePrinter {
    public static void print(List<ArchiveInformation> archives){
        String header = String.format("%-30s %-30s %-8s %-13s %-9s %-8s",
                "DEP","DST","DURATION","DATE","DELAYED","A. TYPE");
        System.out.println(header);
        for (ArchiveInformation a: archives) {
            String data = String.format("%-30s %-30s %-8s %-13s %-9s %-8s",
                    a.getName(),
                    a.getStreetAddress(),
                    a.getCity(),
                    a.getState(),
                    a.getWebSite(),
                    a.getEmailAddress());
            System.out.println(data);
        }
        System.out.println();
    }
}
