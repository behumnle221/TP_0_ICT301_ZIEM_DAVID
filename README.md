# TP_0_ICT301_ZIEM_DAVID
Implementation des principe solide

NOM: ZIEM DAVID DE JESUIS
MATRICULE: 23V2456


                    RESUMER SUR MA COMPREHENSION DES DIFFERNTS PRINCIPE SOLIDE


1. SRP : Single Responsibility Principle
(Principe de Responsabilité Unique)

"Une classe ne doit avoir qu'une seule raison de changer."

Chaque classe doit s'occuper d'une seule fonctionnalite. Si une classe gère à la fois les calculs, l'affichage et la sauvegarde en base de donnees, elle est trop complexe.

Exemple : Une classe Facture ne devrait pas contenir la logique pour imprimer la facture. On crée une classe pour cela.

2. OCP : Open/Closed Principle
(Principe Ouvert/Fermé)

"Ouvert à l'extension, fermé à la modification."

Tu dois pouvoir ajouter de nouvelles fonctionnalités à ton code sans modifier le code existant qui fonctionne déjà. On utilise pour cela les interface.

Exemple : Si tu veux ajouter un nouveau mode de paiement, tu ne modifies pas ta classe Paiement, tu crées une nouvelle classe qui implémente l'interface .

3. LSP : Liskov Substitution Principle
(Principe de Substitution de Liskov)

"Une classe enfant doit pouvoir remplacer sa classe parente sans casser le programme."

Si une classe B hérite de A, on doit pouvoir utiliser B partout où on utilise A sans erreurs inattendues.

Exemple classique : Le carré et le rectangle. Si un carré hérite de rectangle mais qu'il casse la logique des dimensions, il viole deja le principe LSP.

4. ISP : Interface Segregation Principle
(Principe de Ségrégation des Interfaces)

"Il vaut mieux plusieurs petites interfaces spécifiques qu'une seule grosse interface générale."

Une classe ne doit pas être forcée d'implémenter des méthodes dont elle n'a pas besoin. C'est le problème que RobotWorker car il etait forcer d'implémenter eat().


5. DIP : Dependency Inversion Principle
(Principe d'Inversion de Dépendance)

"Dépendre des abstractions (interfaces), pas des implémentations concrètes."

