# Write your MySQL query statement below
SELECT
    sample_id,
    dna_sequence,
    species,
    CASE 
        When dna_sequence like 'ATG%' then 1 else 0 END as has_start,
    CASE
        WHEN dna_sequence like  '%TAA' 
          OR dna_sequence like '%TAG' 
          OR dna_sequence like '%TGA' then 1 else 0 END as has_stop,
    CASE
        WHEN dna_sequence like '%ATAT%' then 1 else 0 END as has_atat,
    CASE
        WHEN dna_sequence like '%GGG%' then 1 else 0 END as has_ggg
FROM 
    Samples;