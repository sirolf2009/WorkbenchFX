package com.dlsc.workbenchfx.view.module;

import com.dlsc.workbenchfx.module.Module;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

public class TabControl extends HBox {
  private final Button closeBtn = new Button("x");
  private final Module module;

  /**
   * Constructs a new {@link TabControl}.
   *
   * @param module which is used to create the {@link TabControl}
   */
  public TabControl(Module module) {
    this.module = module;
    Node icon = module.getIcon();
    Label nameLbl = new Label(module.getName());
    getChildren().addAll(
        icon,
        nameLbl,
        closeBtn
    );
    setMargin(icon, new Insets(0, 0, 0, 10));
    setMargin(nameLbl, new Insets(0, 0, 0, 5));
    setMargin(closeBtn, new Insets(-30, -10, 0, 0));
    getStyleClass().add("tabControl");
  }

  public void setOnClose(EventHandler<ActionEvent> event) {
    closeBtn.setOnAction(event);
  }

  public void setOnActive(EventHandler<MouseEvent> event) {
    setOnMouseClicked(event);
  }
}