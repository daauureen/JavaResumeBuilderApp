package model;

public class Resume {
    private String name;
    private String email;
    private String phone;
    private String skills;
    private String education;
    private String experience;

    public String generateResumeText() {
        return "==================== RESUME ====================\n" +
                " Name: " + name + "\n" +
                " Email: " + email + "\n" +
                " Phone: " + phone + "\n" +
                " Skills: " + skills + "\n" +
                " Education: " + education + "\n" +
                " Experience: " + experience + "\n" +
                "===============================================\n";
    }

    // Геттеры и сеттеры
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getSkills() { return skills; }
    public void setSkills(String skills) { this.skills = skills; }
    public String getEducation() { return education; }
    public void setEducation(String education) { this.education = education; }
    public String getExperience() { return experience; }
    public void setExperience(String experience) { this.experience = experience; }
}