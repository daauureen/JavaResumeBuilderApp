package controller;

import model.Resume;
import java.io.FileWriter;
import java.io.IOException;

public class ResumeController {
    private final Resume resume;

    public ResumeController(Resume resume) {
        this.resume = resume;
    }

    public void updateResume(String name, String email, String phone,
                             String skills, String education, String experience) {
        resume.setName(name);
        resume.setEmail(email);
        resume.setPhone(phone);
        resume.setSkills(skills);
        resume.setEducation(education);
        resume.setExperience(experience);
    }

    public String generateResume() {
        return resume.generateResumeText();
    }

    public void saveToFile(String filename, String content) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        }
    }

    public void clearResume() {
        resume.setName("");
        resume.setEmail("");
        resume.setPhone("");
        resume.setSkills("");
        resume.setEducation("");
        resume.setExperience("");
    }
}