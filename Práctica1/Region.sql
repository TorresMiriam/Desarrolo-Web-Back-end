
DROP TABLE EXISTS Region;
CREATE TABLE IF NOT EXISTS Region(
   Region_id         BIGINT  NOT NULL PRIMARY KEY
  ,Region            VARCHAR(30) NOT NULL
);
INSERT TO Region(Region_id,Region) VALUES (3547,'District of Columbia');
INSERT TO Region(Region_id,Region) VALUES (3548,'Florida');
INSERT TO Region(Region_id,Region) VALUES (3549,'District of Columbia');
INSERT TO Region(Region_id,Region) VALUES (3550,'Texas');
INSERT TO Region(Region_id,Region) VALUES (3551,'Michigan');
INSERT TO Region(Region_id,Region) VALUES (3552,'Kentucky');
INSERT TO Region(Region_id,Region) VALUES (3553,'Kansas');
INSERT TO Region(Region_id,Region) VALUES (3554,'Massachusetts');
INSERT TO Region(Region_id,Region) VALUES (3555,'Florida');
INSERT TO Region(Region_id,Region) VALUES (3556,'Minnesota');

COMMENT ON TABLE Region IS 'Tabla con las características de la Región';
COMMENT ON TABLE Region.Region_id IS 'Número único de cada región';
COMMENT ON TABLE Region.Region IS 'Nombre de la región';