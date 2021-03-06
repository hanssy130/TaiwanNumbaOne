package FinalProject;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Holds the different Timeline Stages.
 *
 * @author Brian Duong
 * @author Hans Sy
 * @author Justin Majam
 * @author Jason Lui
 * @version 2020
 */
public class Timelines extends Stage {

    // Holds the title
    private Label title;
    // Holds the back Button
    private Button btnBack;

    /**
     * Border Control Stage.
     */
    public void borderControlStage() {
        // Pane Setup
        BorderPane layoutIntro = new BorderPane();
        layoutIntro.setBackground(new Background(
                new BackgroundFill(Color.rgb(173, 216, 230),
                        CornerRadii.EMPTY,
                        Insets.EMPTY
                )));
        layoutIntro.setPadding(new Insets(10));

        title = new Label("Border Control, Travel, & Finding Cases Timeline");
        title.setFont(new Font("Arial", 20));

        // Back button
        btnBack = new Button("Back");
        btnBack.setOnAction(actionEvent -> {
            new TimelineMenu().timeLineStage();
            this.close();
        });

        String[] stuff = TimelineInfo.borderControlDates();
        String[] describe = TimelineInfo.borderControlStage();
        TimelineGraphic test = new TimelineGraphic(stuff, describe);
        // Use Vbox to stack vertically.
        VBox vbox = new VBox();
        vbox.getChildren().addAll(title, test.getTimeline(), btnBack);
        layoutIntro.setCenter(vbox);
        final int spacing = 15;
        final int inset = 15;
        vbox.setSpacing(spacing);
        vbox.setPadding(new Insets(inset, 0, 0, 0));
        vbox.setAlignment(Pos.CENTER);


        // Create the scene.
        Scene sceneMain = new Scene(layoutIntro, 800, 600);
        this.setTitle("Border Control");
        this.setScene(sceneMain);
        this.setResizable(false);
        this.show();
    }

    /**
     * Resource Allocation Stage.
     */
    public void resourceAllocationStage() {
        // Pane Setup
        BorderPane layoutIntro = new BorderPane();
        layoutIntro.setBackground(new Background(
                new BackgroundFill(Color.rgb(173, 216, 230),
                        CornerRadii.EMPTY,
                        Insets.EMPTY
                )));
        layoutIntro.setPadding(new Insets(10));

        title = new Label("Resource Allocation Timeline");
        title.setFont(new Font("Arial", 20));

        // Back button
        btnBack = new Button("Back");
        btnBack.setOnAction(actionEvent -> {
            new TimelineMenu().timeLineStage();
            this.close();
        });

        String[] stuff = TimelineInfo.resourceAllocationDates();
        String[] describe = TimelineInfo.resourceAllocation();
        TimelineGraphic test = new TimelineGraphic(stuff, describe);

        // Use Vbox to stack vertically.
        VBox vbox = new VBox();
        vbox.getChildren().addAll(title, test.getTimeline(), btnBack);
        vbox.setAlignment(Pos.TOP_LEFT);
        layoutIntro.setCenter(vbox);
        final int spacing = 15;
        final int inset = 15;
        vbox.setSpacing(spacing);
        vbox.setPadding(new Insets(inset, 0, 0, 0));
        vbox.setAlignment(Pos.CENTER);

        // Create the scene.
        Scene sceneMain = new Scene(layoutIntro, 800, 600);
        this.setTitle("Introduction");
        this.setScene(sceneMain);
        this.setResizable(false);
        this.show();
    }

    /**
     * Creates the Communications Stage.
     */
    public void communicationsStage() {
        // Pane Setup
        BorderPane layoutIntro = new BorderPane();
        layoutIntro.setBackground(new Background(
                new BackgroundFill(Color.rgb(173, 216, 230),
                        CornerRadii.EMPTY,
                        Insets.EMPTY
                )));
        layoutIntro.setPadding(new Insets(10));

        title = new Label("Communications Timeline");
        title.setFont(new Font("Arial", 20));

        // Back button
        btnBack = new Button("Back");
        btnBack.setOnAction(actionEvent -> {
            new TimelineMenu().timeLineStage();
            this.close();
        });

        String[] stuff = TimelineInfo.communicationDates();
        String[] describe = TimelineInfo.communicationsStage();
        TimelineGraphic test = new TimelineGraphic(stuff, describe);

        // Use Vbox to stack vertically.
        VBox vbox = new VBox();
        vbox.getChildren().addAll(title, test.getTimeline(), btnBack);
        vbox.setAlignment(Pos.TOP_LEFT);
        layoutIntro.setCenter(vbox);
        final int spacing = 15;
        final int inset = 15;
        vbox.setSpacing(spacing);
        vbox.setPadding(new Insets(inset, 0, 0, 0));
        vbox.setAlignment(Pos.CENTER);

        // Create the scene.
        Scene sceneMain = new Scene(layoutIntro, 800, 600);
        this.setTitle("Communication Stage");
        this.setScene(sceneMain);
        this.setResizable(false);
        this.show();
    }
}
