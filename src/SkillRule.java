public class SkillRule extends EligibilityRule {

    @Override
    public String getRuleName() {
        return "Skills";
    }

    @Override
    public boolean check(Candidate candidate, Job job) {
        String[] reqSkills = job.getReqSkills();
        for (int i = 0; i < reqSkills.length; i++) {
            if (!candidate.hasSkill(reqSkills[i])) {
                return false;
            }
        }
        return true;
    }

}
