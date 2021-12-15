package com.codewithmosh.decorator;

public class Editor {
    public void openProject(String path) {
        Artefact[] artefacts = {
                new Error(new Main(new ConcreatArtifact("Main"))),
                new ConcreatArtifact("Demo"),
                new Error(new ConcreatArtifact("EmailClient")),
                new ConcreatArtifact("EmailProvider"),
        };

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
