# progress-bar-pl

![Build](https://github.com/mlvandijk/progress-bar-pl/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/MARKETPLACE_ID.svg)](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/MARKETPLACE_ID.svg)](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID)

## Features
- Custom progress bar with Polish flag colors (white and red)
- Animated neutral smile emoji that moves along the progress bar
- Smooth animation for a pleasant user experience

## Implementation Details
The plugin replaces the standard IntelliJ progress bar with a custom implementation featuring:

1. **Polish Flag Colors**: The progress bar displays alternating white and red stripes, representing the Polish flag.
2. **Neutral Smile Emoji**: A simple neutral smile emoji moves along the progress bar.
3. **Animation**: The progress bar includes smooth animation for a better user experience.

## Testing
To test the plugin:

1. Build and run the plugin using the Gradle `runIde` task
2. Perform operations that show a progress bar (like indexing, searching, or building)
3. Observe the custom Polish flag progress bar with the neutral smile emoji

## Next Steps
- [ ] Add a settings panel to customize colors and animation speed
- [ ] Improve the emoji design
- [ ] Add more animation options
- [ ] Publish the plugin to JetBrains Marketplace

<!-- Plugin description -->
The Polish Flag Progress Bar plugin replaces the standard IntelliJ progress bar with a custom progress bar featuring:

- Polish flag colors (white and red stripes)
- A neutral smile emoji that moves along the progress bar
- Smooth animation for a pleasant user experience

This plugin is inspired by the popular Nyan Cat progress bar but with a Polish theme.
<!-- Plugin description end -->

## Installation

- Using the IDE built-in plugin system:

  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "progress-bar-pl"</kbd> >
  <kbd>Install</kbd>

- Using JetBrains Marketplace:

  Go to [JetBrains Marketplace](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID) and install it by clicking the <kbd>Install to ...</kbd> button in case your IDE is running.

  You can also download the [latest release](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID/versions) from JetBrains Marketplace and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

- Manually:

  Download the [latest release](https://github.com/mlvandijk/progress-bar-pl/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
[docs:plugin-description]: https://plugins.jetbrains.com/docs/intellij/plugin-user-experience.html#plugin-description-and-presentation
