package turillolucaos;

/**
 *
 * @author Turillo.Luca
 */
public class Processo {

    private Integer PID;
    private Integer nInstructions;
    private Integer nInstructionsRemained;

    public Processo(Integer PID, Integer nInstructions) {
        this.PID = PID;
        this.nInstructions = nInstructions;
        this.nInstructionsRemained = nInstructions;
    }

    public Integer getPID() {
        return PID;
    }

    public void setPID(Integer PID) {
        this.PID = PID;
    }

    public Integer getnInstructions() {
        return nInstructions;
    }

    public void setnInstructions(Integer nInstructions) {
        this.nInstructions = nInstructions;
    }

    public Integer getnInstructionsRemained() {
        return nInstructionsRemained;
    }

    public void setnInstructionsRemained(Integer nInstructionsRemained) {
        this.nInstructionsRemained = nInstructionsRemained;
    }

    @Override
    public String toString() {
        return "PID=" + PID + ", Istruzioni" + nInstructions + ", Istruzioni Rimanenti=" + nInstructionsRemained;
    }

    public Boolean executeExtraction() {
        Boolean pop = false;
        if (nInstructionsRemained > 0) {
            nInstructionsRemained--;
        } else {
            pop = true;
        }
        return pop;
    }
}
