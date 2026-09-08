SELECT
  score,
  (SELECT count(distinct score) FROM Scores WHERE score >= s.score)  as 'rank'
FROM Scores s
ORDER BY score desc;