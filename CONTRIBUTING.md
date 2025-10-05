# Contributing to Hacktoberfest 2025

Thanks for your interest in contributing to our Hacktoberfest 2025 guide! We welcome contributions from developers of all skill levels. This document provides guidelines to help you contribute effectively.

## 🚀 Quick Start

1. **Fork** the repository
2. **Clone** your fork locally
3. **Create** a new branch for your changes
4. **Make** your changes
5. **Test** your changes locally
6. **Submit** a pull request

---

## 📝 Creating Issues

### Good Issue Titles
- Be specific and descriptive
- Use action words (Fix, Add, Update, Remove)
- Include the component/file affected
- Examples:
  - ✅ "Fix typo in README.md badge URL"
  - ✅ "Add mobile responsiveness to repository table"
  - ❌ "Bug in readme"
  - ❌ "Fix this"

### Issue Description Template
When creating an issue, please include:

```markdown
## 🐛 Bug Description / 💡 Feature Request
[Clear description of the issue or feature]

## 📍 Location
- **File(s):** [filename(s)]
- **Line(s):** [line numbers if applicable]

## 🔧 Expected Behavior / Proposed Solution
[What should happen or how to implement]

## 📋 Additional Context
[Screenshots, examples, or additional information]
```

### Labels
Use appropriate labels:
- `bug` - Something isn't working
- `enhancement` - New feature or improvement
- `documentation` - Documentation updates
- `good first issue` - Good for newcomers
- `help wanted` - Extra attention needed
- `hacktoberfest` - Hacktoberfest eligible

---

## 🔀 Pull Request Guidelines

### Branch Naming Convention
Use descriptive branch names with prefixes:
- `fix/` - Bug fixes (e.g., `fix/badge-typo-readme`)
- `feat/` - New features (e.g., `feat/add-mobile-navigation`)
- `docs/` - Documentation (e.g., `docs/update-contributing-guide`)
- `style/` - Formatting/style (e.g., `style/improve-css-organization`)

### Pull Request Template
Use this template for your PR description:

```markdown
## Description
Fixes #[issue-number]

[Brief description of changes made]

## Type of Change
- [ ] Bug fix (non-breaking change that fixes an issue)
- [ ] New feature (non-breaking change that adds functionality)
- [ ] Documentation update
- [ ] Style/formatting change

## Changes Made
- [List specific changes]
- [Be detailed but concise]

## Testing
- [ ] I have tested these changes locally
- [ ] Website preview works correctly
- [ ] No broken links or formatting issues
- [ ] Changes are responsive (if applicable)

## Screenshots (if applicable)
[Add before/after screenshots for visual changes]

## Checklist
- [ ] My code follows the project's style guidelines
- [ ] I have performed a self-review of my code
- [ ] My changes generate no new warnings
- [ ] I have added appropriate labels to this PR
```

---

## 💻 Local Development

### Previewing Changes
1. From the repository root, run:
```bash
python3 -m http.server 8000
```

2. Open http://localhost:8000/index.html in your browser

### Alternative Methods
- **Node.js:** `npx serve .`
- **PHP:** `php -S localhost:8000`
- **VS Code:** Use Live Server extension

### Testing Checklist
Before submitting your PR, verify:
- [ ] All links work correctly
- [ ] Images load properly
- [ ] Responsive design works on mobile
- [ ] No HTML/CSS syntax errors
- [ ] Markdown renders correctly
- [ ] No broken badges or external links

---

## 📐 Style Guidelines

### Markdown
- Use consistent heading levels
- Add blank lines around code blocks
- Use descriptive link text
- Keep lines under 100 characters when possible

### HTML/CSS
- Use semantic HTML elements
- Follow existing indentation (2 spaces)
- Comment complex CSS rules
- Ensure accessibility best practices

### Commit Messages
Follow conventional commit format:
```
type(scope): brief description

Examples:
- fix(readme): correct badge URL typo
- feat(html): add alt text for accessibility
- docs(contributing): add PR template guidelines
```

**Types:**
- `fix` - Bug fixes
- `feat` - New features
- `docs` - Documentation
- `style` - Formatting changes
- `refactor` - Code restructuring
- `test` - Adding tests

---

## 🌐 Website Deployment

### GitHub Pages Branch
- Branch `website-pages` is used for GitHub Pages hosting
- You can create PRs from this branch to `main`
- To preview from this branch: check out the branch and run the local server

### Deployment Notes
- Changes to `main` may not immediately reflect on the live site
- Static assets should be optimized for web delivery
- Test thoroughly before merging to deployment branch

---

## 🤝 Community Guidelines

### Code of Conduct
- Be respectful and inclusive
- Provide constructive feedback
- Help newcomers learn and grow
- Follow our [Code of Conduct](CODE_OF_CONDUCT.md)

### Getting Help
- Check existing issues before creating new ones
- Use clear, descriptive titles
- Join our [WhatsApp channel](https://chat.whatsapp.com/BfBWJhy4xj3CJFSGE2qBrL) for questions
- Tag maintainers if you need urgent help

### Recognition
Contributors will be recognized in:
- GitHub contributors graph
- README.md contributors section
- Special mentions for significant contributions

---

## 🎯 Hacktoberfest Specific

### Eligible Contributions
- Bug fixes and improvements
- Documentation enhancements
- Accessibility improvements
- New features (with prior discussion)
- Code organization and cleanup

### Quality Standards
- No trivial or spam PRs
- Must add meaningful value
- Follow project guidelines
- Engage with feedback constructively

### Review Process
1. Automated checks run on PR submission
2. Maintainer review within 48-72 hours
3. Feedback and iteration if needed
4. Merge once approved and tests pass

---

Thank you for contributing to making open source better! 🎉
