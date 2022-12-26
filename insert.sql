USE kingdomdb;

INSERT INTO mst_category (id, category_name, category_description, created_at, updated_at)
            values(1, "春", "3月,4月,5月", now(), now());

INSERT INTO mst_category (id, category_name, category_description, created_at, updated_at)
            values(2, "夏", "6月,7月,8月", now(), now());

INSERT INTO mst_category (id, category_name, category_description, created_at, updated_at)
            values(3, "秋", "9月,10月,11月", now(), now());

INSERT INTO mst_category (id, category_name, category_description, created_at, updated_at)
            values(4, "冬", "12月,1月,2月", now(), now());



INSERT INTO mst_product (product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company, created_at)
            values("苺", "いちご", "産地：栃木　詳細：糖度が高くてほどよい酸味があり、果汁も豊富。果実がしっかりしているので、比較的日持ちがよい。", 1, 500, "/img/strawberry.png", "2022/3/12", "アグリ神木", now());

INSERT INTO mst_product (product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company, created_at)
            values("キウイ", "きうい", " 産地 : 香川　詳細 : 県と香川大学により開発された「さぬきキウイっこ」。糖度が高く甘いです。", 1, 118, "/img/kiwi.png", "2022/4/7", "河村商事", now()); 

INSERT INTO mst_product (product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company, created_at)
            values("西瓜", "すいか", "産地：熊本　詳細: スイカ農家の方から直接取り寄せた、糖度17のとても甘いスイカです。", 2, 1000, "/img/watermelon.png", "2022/7/1", "アグリ神木", now());

INSERT INTO mst_product (product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company, created_at)
            values("パイナップル", "ぱいなっぷる", "産地：沖縄　詳細：酸味と甘味のバランスがよく、果汁も豊富。完熟した果肉は口の中でとろけるやわらかさです。生食はもちろん、缶詰やジュースにも最適。", 2, 900, "/img/pineapple.png", "2022/8/19", "河村商事", now());

INSERT INTO mst_product (product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company, created_at)
            values("ぶどう", "ぶどう", "産地：山梨　詳細：ぶどうの定番として古くから一般的に親しまれているぶどうです。果粒は小粒でも、強い甘さと、それを支えるに十分な酸味をもち、ほのかな芳香があります。", 3, 400, "/img/grape.png", "2022/9/13", "アグリ神木", now());

INSERT INTO mst_product (product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company, created_at)
            values("梨", "なし", "産地：千葉　詳細：多汁で酸味と甘みのバランスが良い豊水という品種です。", 3, 180, "/img/nashi.png", "2022/10/3", "依光青果", now());

INSERT INTO mst_product (product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company, created_at)
            values("蜜柑", "みかん", "産地：愛媛　詳細：瀬戸内の温暖な気候で太陽の恵みをいっぱいに浴びて育った、甘く、コクのあるみかんです。", 4, 50, "/img/orange.png", "2022/11/17", "河村商事", now());

INSERT INTO mst_product (product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company, created_at)
            values("リンゴ", "りんご", "産地 : 福島　詳細 : 緑色に斑点のついた外見が特徴的。香りと甘味が強い、大林という品種です。", 4, 100, "/img/apple.png", "2022/12/9", "依光青果", now());

INSERT INTO mst_product (product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company, created_at)
            values("金柑", "きんかん", "産地 : 宮崎　詳細 : 加工用に比べ大きくて甘く、『生』のままおいしく食べられます。皮ごと丸かじり！", 4, 3000, "/img/kinkan.png", "2022/1/15", "アグリ神木", now());









