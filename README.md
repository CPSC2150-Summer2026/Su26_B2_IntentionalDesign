# B2 - Intentional Design

You have inherited a small Java course registration project. The registration behavior is already implemented, but the project does not yet meet the course expectations for requirements, documentation, style, and intentional design.

Your job is not to add a new feature. Your job is to clean up and document the project so it is easier to understand, verify, and maintain.

## Permitted Plugins

checkstyle
google-java-format
gradle (as that's technically a plugin...)

## Required TODOs

1. Complete `requirements.md` in the `docs/` directory.
2. Identify style violations according to the provided checkstyle guide (which is _very_ similar to Google's Java style guide)
   * Note that this isn't a literal deliverable. You just need to be aware of what exactly needs fixing.
3. Fix all the style violations in `src/main/java/cpsc2150/registration/RegistrationManager.java`.
4. Add Javadocs with Design by Contract to the two methods in `RegistrationManager.java`.

After doing everything above, your code should build and all checks should pass.

Tip: Just because Gradle was a part of Tools-and-Tech, doesn't mean it's not relevant here. There are tasks that, if you
know how to run them, can help you with the above TODOs. You can look at the Gradle tool window and see the
"benchmark" group, which defines all the tasks you'll _need_ to run. It wouldn't hurt to look at the Gradle build either.

## Code Editing Limits

You should not change the registration rules or add new behavior.

You may edit Java code only to:
- fix formatting,
- fix style violations,
- improve variable or parameter names,
- add Javadocs,
- make Checkstyle pass.

Do not change the public behavior of the program.

## Submission Instructions

Before you do anything to submit, make sure you run these Gradle tasks (you can run them from the README in IntelliJ):
`./gradlew benchmarkCheck`
`./gradlew benchmarkJavadocs` Note that this will also yield warnings even if you did it correctly, the files you weren't supposed to change will still have missing Javadocs.
`./gradlew benchmarkTest`
`./gradlew benchmarkCopyReports`

You need to commit and push everything to GitHub.
Make sure everything you need is there. We'll be looking at your GitHub repo to grade your work, so if it's not there, we won't see it.
I would double check the following files are on GitHub and are up to date:
- `docs/requirements.md`
- `src/main/java/cpsc2150/registration/RegistrationManager.java`
- `submission-reports/` and all the 75+ something files in there, specifically:
  - submission-reports/checkstyle/main.html
  - submission-reports/javadoc/index.html
  - submission-reports/tests/index.html

Once you have pushed, submit the repo to Gradescope: https://www.gradescope.com/courses/1315268/assignments/8210437/submissions