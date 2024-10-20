package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoxz {
    public static final Map a;

    static {
        alob alobVar;
        alob alobVar2;
        alob alobVar3;
        alob alobVar4;
        alob alobVar5;
        alob alobVar6;
        alob alobVar7;
        alob alobVar8;
        alob alobVar9;
        alob alobVar10;
        alob alobVar11;
        alob alobVar12;
        alob alobVar13;
        alob alobVar14;
        alob alobVar15;
        alob alobVar16;
        alob alobVar17;
        alob alobVar18;
        alob alobVar19;
        alob alobVar20;
        alob alobVar21;
        alob alobVar22;
        alob alobVar23;
        alob alobVar24;
        alob alobVar25;
        alob alobVar26;
        alob alobVar27;
        alob alobVar28;
        alob alobVar29;
        alob alobVar30;
        alob alobVar31;
        alob alobVar32;
        alob alobVar33;
        alob alobVar34;
        alob alobVar35;
        alob alobVar36;
        alob alobVar37;
        alob alobVar38;
        alob alobVar39;
        alob alobVar40;
        alob alobVar41;
        alob alobVar42;
        alob alobVar43;
        alob alobVar44;
        alob alobVar45;
        alob alobVar46;
        alob alobVar47;
        alob alobVar48;
        alob alobVar49;
        alob alobVar50;
        alob alobVar51;
        alob alobVar52;
        alob alobVar53;
        alob alobVar54;
        alob alobVar55;
        alob alobVar56;
        alob alobVar57;
        alob alobVar58;
        alob alobVar59;
        alob alobVar60;
        alob alobVar61;
        alob alobVar62;
        alob alobVar63;
        alob alobVar64;
        alob alobVar65;
        alob alobVar66;
        alob alobVar67;
        alob alobVar68;
        alob alobVar69;
        alob alobVar70;
        alob alobVar71;
        alob alobVar72;
        alob alobVar73;
        alob alobVar74;
        alob alobVar75;
        alob alobVar76;
        alob alobVar77;
        alob alobVar78;
        alob alobVar79;
        alob alobVar80;
        alob alobVar81;
        alob alobVar82;
        alob alobVar83;
        alob alobVar84;
        alob alobVar85;
        alob alobVar86;
        alob alobVar87;
        alob alobVar88;
        alob alobVar89;
        alob alobVar90;
        alob alobVar91;
        alob alobVar92;
        alob alobVar93;
        alob alobVar94;
        alob alobVar95;
        alob alobVar96;
        alob alobVar97;
        alob alobVar98;
        alob alobVar99;
        alob alobVar100;
        alob alobVar101;
        alob alobVar102;
        alob alobVar103;
        alob alobVar104;
        TreeMap treeMap = new TreeMap();
        if (treeMap.containsKey("s")) {
            alobVar = (alob) treeMap.get("s");
        } else {
            alobVar = new alob();
            treeMap.put("s", alobVar);
        }
        alobVar.h(new aoxy(aoyb.SIZE, aoya.INTEGER));
        if (treeMap.containsKey("w")) {
            alobVar2 = (alob) treeMap.get("w");
        } else {
            alob alobVar105 = new alob();
            treeMap.put("w", alobVar105);
            alobVar2 = alobVar105;
        }
        alobVar2.h(new aoxy(aoyb.WIDTH, aoya.INTEGER));
        if (treeMap.containsKey("c")) {
            alobVar3 = (alob) treeMap.get("c");
        } else {
            alobVar3 = new alob();
            treeMap.put("c", alobVar3);
        }
        alobVar3.h(new aoxy(aoyb.CROP, aoya.BOOLEAN));
        if (treeMap.containsKey("d")) {
            alobVar4 = (alob) treeMap.get("d");
        } else {
            alob alobVar106 = new alob();
            treeMap.put("d", alobVar106);
            alobVar4 = alobVar106;
        }
        alobVar4.h(new aoxy(aoyb.DOWNLOAD, aoya.BOOLEAN));
        if (treeMap.containsKey("h")) {
            alobVar5 = (alob) treeMap.get("h");
        } else {
            alobVar5 = new alob();
            treeMap.put("h", alobVar5);
        }
        alobVar5.h(new aoxy(aoyb.HEIGHT, aoya.INTEGER));
        if (treeMap.containsKey("s")) {
            alobVar6 = (alob) treeMap.get("s");
        } else {
            alob alobVar107 = new alob();
            treeMap.put("s", alobVar107);
            alobVar6 = alobVar107;
        }
        alobVar6.h(new aoxy(aoyb.STRETCH, aoya.BOOLEAN));
        if (treeMap.containsKey("h")) {
            alobVar7 = (alob) treeMap.get("h");
        } else {
            alobVar7 = new alob();
            treeMap.put("h", alobVar7);
        }
        alobVar7.h(new aoxy(aoyb.HTML, aoya.BOOLEAN));
        if (treeMap.containsKey("p")) {
            alobVar8 = (alob) treeMap.get("p");
        } else {
            alobVar8 = new alob();
            treeMap.put("p", alobVar8);
        }
        alobVar8.h(new aoxy(aoyb.SMART_CROP, aoya.BOOLEAN));
        if (treeMap.containsKey("pp")) {
            alobVar9 = (alob) treeMap.get("pp");
        } else {
            alob alobVar108 = new alob();
            treeMap.put("pp", alobVar108);
            alobVar9 = alobVar108;
        }
        alobVar9.h(new aoxy(aoyb.SMART_CROP_NO_CLIP, aoya.BOOLEAN));
        if (treeMap.containsKey("pf")) {
            alobVar10 = (alob) treeMap.get("pf");
        } else {
            alob alobVar109 = new alob();
            treeMap.put("pf", alobVar109);
            alobVar10 = alobVar109;
        }
        alobVar10.h(new aoxy(aoyb.SMART_CROP_USE_FACE, aoya.BOOLEAN));
        if (treeMap.containsKey("n")) {
            alobVar11 = (alob) treeMap.get("n");
        } else {
            alob alobVar110 = new alob();
            treeMap.put("n", alobVar110);
            alobVar11 = alobVar110;
        }
        alobVar11.h(new aoxy(aoyb.CENTER_CROP, aoya.BOOLEAN));
        if (treeMap.containsKey("r")) {
            alobVar12 = (alob) treeMap.get("r");
        } else {
            alobVar12 = new alob();
            treeMap.put("r", alobVar12);
        }
        alobVar12.h(new aoxy(aoyb.ROTATE, aoya.INTEGER));
        if (treeMap.containsKey("r")) {
            alobVar13 = (alob) treeMap.get("r");
        } else {
            alob alobVar111 = new alob();
            treeMap.put("r", alobVar111);
            alobVar13 = alobVar111;
        }
        alobVar13.h(new aoxy(aoyb.SKIP_REFERER_CHECK, aoya.BOOLEAN));
        if (treeMap.containsKey("o")) {
            alobVar14 = (alob) treeMap.get("o");
        } else {
            alobVar14 = new alob();
            treeMap.put("o", alobVar14);
        }
        alobVar14.h(new aoxy(aoyb.OVERLAY, aoya.BOOLEAN));
        if (treeMap.containsKey("o")) {
            alobVar15 = (alob) treeMap.get("o");
        } else {
            alob alobVar112 = new alob();
            treeMap.put("o", alobVar112);
            alobVar15 = alobVar112;
        }
        alobVar15.h(new aoxy(aoyb.OBJECT_ID, aoya.FIXED_LENGTH_BASE_64));
        if (treeMap.containsKey("j")) {
            alobVar16 = (alob) treeMap.get("j");
        } else {
            alob alobVar113 = new alob();
            treeMap.put("j", alobVar113);
            alobVar16 = alobVar113;
        }
        alobVar16.h(new aoxy(aoyb.FRAME_ID, aoya.FIXED_LENGTH_BASE_64));
        if (treeMap.containsKey("x")) {
            alobVar17 = (alob) treeMap.get("x");
        } else {
            alob alobVar114 = new alob();
            treeMap.put("x", alobVar114);
            alobVar17 = alobVar114;
        }
        alobVar17.h(new aoxy(aoyb.TILE_X, aoya.INTEGER));
        if (treeMap.containsKey("y")) {
            alobVar18 = (alob) treeMap.get("y");
        } else {
            alob alobVar115 = new alob();
            treeMap.put("y", alobVar115);
            alobVar18 = alobVar115;
        }
        alobVar18.h(new aoxy(aoyb.TILE_Y, aoya.INTEGER));
        if (treeMap.containsKey("z")) {
            alobVar19 = (alob) treeMap.get("z");
        } else {
            alob alobVar116 = new alob();
            treeMap.put("z", alobVar116);
            alobVar19 = alobVar116;
        }
        alobVar19.h(new aoxy(aoyb.TILE_ZOOM, aoya.INTEGER));
        if (treeMap.containsKey("g")) {
            alobVar20 = (alob) treeMap.get("g");
        } else {
            alob alobVar117 = new alob();
            treeMap.put("g", alobVar117);
            alobVar20 = alobVar117;
        }
        alobVar20.h(new aoxy(aoyb.TILE_GENERATION, aoya.BOOLEAN));
        if (treeMap.containsKey("e")) {
            alobVar21 = (alob) treeMap.get("e");
        } else {
            alob alobVar118 = new alob();
            treeMap.put("e", alobVar118);
            alobVar21 = alobVar118;
        }
        alobVar21.h(new aoxy(aoyb.EXPIRATION_TIME, aoya.INTEGER));
        if (treeMap.containsKey("f")) {
            alobVar22 = (alob) treeMap.get("f");
        } else {
            alob alobVar119 = new alob();
            treeMap.put("f", alobVar119);
            alobVar22 = alobVar119;
        }
        alobVar22.h(new aoxy(aoyb.IMAGE_FILTER, aoya.STRING));
        if (treeMap.containsKey("k")) {
            alobVar23 = (alob) treeMap.get("k");
        } else {
            alobVar23 = new alob();
            treeMap.put("k", alobVar23);
        }
        alobVar23.h(new aoxy(aoyb.KILL_ANIMATION, aoya.BOOLEAN));
        if (treeMap.containsKey("u")) {
            alobVar24 = (alob) treeMap.get("u");
        } else {
            alob alobVar120 = new alob();
            treeMap.put("u", alobVar120);
            alobVar24 = alobVar120;
        }
        alobVar24.h(new aoxy(aoyb.UNFILTERED, aoya.BOOLEAN));
        if (treeMap.containsKey("ut")) {
            alobVar25 = (alob) treeMap.get("ut");
        } else {
            alobVar25 = new alob();
            treeMap.put("ut", alobVar25);
        }
        alobVar25.h(new aoxy(aoyb.UNFILTERED_WITH_TRANSFORMS, aoya.BOOLEAN));
        if (treeMap.containsKey("i")) {
            alobVar26 = (alob) treeMap.get("i");
        } else {
            alobVar26 = new alob();
            treeMap.put("i", alobVar26);
        }
        alobVar26.h(new aoxy(aoyb.INCLUDE_METADATA, aoya.BOOLEAN));
        if (treeMap.containsKey("a")) {
            alobVar27 = (alob) treeMap.get("a");
        } else {
            alobVar27 = new alob();
            treeMap.put("a", alobVar27);
        }
        alobVar27.h(new aoxy(aoyb.ES_PORTRAIT_APPROVED_ONLY, aoya.BOOLEAN));
        if (treeMap.containsKey("b")) {
            alobVar28 = (alob) treeMap.get("b");
        } else {
            alobVar28 = new alob();
            treeMap.put("b", alobVar28);
        }
        alobVar28.h(new aoxy(aoyb.BYPASS_TAKEDOWN, aoya.BOOLEAN));
        if (treeMap.containsKey("b")) {
            alobVar29 = (alob) treeMap.get("b");
        } else {
            alob alobVar121 = new alob();
            treeMap.put("b", alobVar121);
            alobVar29 = alobVar121;
        }
        alobVar29.h(new aoxy(aoyb.BORDER_SIZE, aoya.INTEGER));
        if (treeMap.containsKey("c")) {
            alobVar30 = (alob) treeMap.get("c");
        } else {
            alob alobVar122 = new alob();
            treeMap.put("c", alobVar122);
            alobVar30 = alobVar122;
        }
        alobVar30.h(new aoxy(aoyb.BORDER_COLOR, aoya.PREFIX_HEX));
        if (treeMap.containsKey("q")) {
            alobVar31 = (alob) treeMap.get("q");
        } else {
            alobVar31 = new alob();
            treeMap.put("q", alobVar31);
        }
        alobVar31.h(new aoxy(aoyb.QUERY_STRING, aoya.STRING));
        if (treeMap.containsKey("fh")) {
            alobVar32 = (alob) treeMap.get("fh");
        } else {
            alobVar32 = new alob();
            treeMap.put("fh", alobVar32);
        }
        alobVar32.h(new aoxy(aoyb.HORIZONTAL_FLIP, aoya.BOOLEAN));
        if (treeMap.containsKey("fv")) {
            alobVar33 = (alob) treeMap.get("fv");
        } else {
            alobVar33 = new alob();
            treeMap.put("fv", alobVar33);
        }
        alobVar33.h(new aoxy(aoyb.VERTICAL_FLIP, aoya.BOOLEAN));
        if (treeMap.containsKey("fg")) {
            alobVar34 = (alob) treeMap.get("fg");
        } else {
            alobVar34 = new alob();
            treeMap.put("fg", alobVar34);
        }
        alobVar34.h(new aoxy(aoyb.FORCE_TILE_GENERATION, aoya.BOOLEAN));
        if (treeMap.containsKey("ci")) {
            alobVar35 = (alob) treeMap.get("ci");
        } else {
            alobVar35 = new alob();
            treeMap.put("ci", alobVar35);
        }
        alobVar35.h(new aoxy(aoyb.IMAGE_CROP, aoya.BOOLEAN));
        if (treeMap.containsKey("rw")) {
            alobVar36 = (alob) treeMap.get("rw");
        } else {
            alobVar36 = new alob();
            treeMap.put("rw", alobVar36);
        }
        alobVar36.h(new aoxy(aoyb.REQUEST_WEBP, aoya.BOOLEAN));
        if (treeMap.containsKey("rwu")) {
            alobVar37 = (alob) treeMap.get("rwu");
        } else {
            alobVar37 = new alob();
            treeMap.put("rwu", alobVar37);
        }
        alobVar37.h(new aoxy(aoyb.REQUEST_WEBP_UNLESS_MAYBE_TRANSPARENT, aoya.BOOLEAN));
        if (treeMap.containsKey("rwa")) {
            alobVar38 = (alob) treeMap.get("rwa");
        } else {
            alobVar38 = new alob();
            treeMap.put("rwa", alobVar38);
        }
        alobVar38.h(new aoxy(aoyb.REQUEST_ANIMATED_WEBP, aoya.BOOLEAN));
        if (treeMap.containsKey("nw")) {
            alobVar39 = (alob) treeMap.get("nw");
        } else {
            alobVar39 = new alob();
            treeMap.put("nw", alobVar39);
        }
        alobVar39.h(new aoxy(aoyb.NO_WEBP, aoya.BOOLEAN));
        if (treeMap.containsKey("rh")) {
            alobVar40 = (alob) treeMap.get("rh");
        } else {
            alobVar40 = new alob();
            treeMap.put("rh", alobVar40);
        }
        alobVar40.h(new aoxy(aoyb.REQUEST_H264, aoya.BOOLEAN));
        if (treeMap.containsKey("no")) {
            alobVar41 = (alob) treeMap.get("no");
        } else {
            alobVar41 = new alob();
            treeMap.put("no", alobVar41);
        }
        alobVar41.h(new aoxy(aoyb.NO_OVERLAY, aoya.BOOLEAN));
        if (treeMap.containsKey("ns")) {
            alobVar42 = (alob) treeMap.get("ns");
        } else {
            alobVar42 = new alob();
            treeMap.put("ns", alobVar42);
        }
        alobVar42.h(new aoxy(aoyb.NO_SILHOUETTE, aoya.BOOLEAN));
        if (treeMap.containsKey("k")) {
            alobVar43 = (alob) treeMap.get("k");
        } else {
            alobVar43 = new alob();
            treeMap.put("k", alobVar43);
        }
        alobVar43.h(new aoxy(aoyb.FOCUS_BLUR, aoya.INTEGER));
        if (treeMap.containsKey("p")) {
            alobVar44 = (alob) treeMap.get("p");
        } else {
            alob alobVar123 = new alob();
            treeMap.put("p", alobVar123);
            alobVar44 = alobVar123;
        }
        alobVar44.h(new aoxy(aoyb.FOCAL_PLANE, aoya.INTEGER));
        if (treeMap.containsKey("l")) {
            alobVar45 = (alob) treeMap.get("l");
        } else {
            alobVar45 = new alob();
            treeMap.put("l", alobVar45);
        }
        alobVar45.h(new aoxy(aoyb.QUALITY_LEVEL, aoya.INTEGER));
        if (treeMap.containsKey("v")) {
            alobVar46 = (alob) treeMap.get("v");
        } else {
            alobVar46 = new alob();
            treeMap.put("v", alobVar46);
        }
        alobVar46.h(new aoxy(aoyb.QUALITY_BUCKET, aoya.INTEGER));
        if (treeMap.containsKey("nu")) {
            alobVar47 = (alob) treeMap.get("nu");
        } else {
            alobVar47 = new alob();
            treeMap.put("nu", alobVar47);
        }
        alobVar47.h(new aoxy(aoyb.NO_UPSCALE, aoya.BOOLEAN));
        if (treeMap.containsKey("ft")) {
            alobVar48 = (alob) treeMap.get("ft");
        } else {
            alobVar48 = new alob();
            treeMap.put("ft", alobVar48);
        }
        alobVar48.h(new aoxy(aoyb.FORCE_TRANSFORMATION, aoya.BOOLEAN));
        if (treeMap.containsKey("cc")) {
            alobVar49 = (alob) treeMap.get("cc");
        } else {
            alobVar49 = new alob();
            treeMap.put("cc", alobVar49);
        }
        alobVar49.h(new aoxy(aoyb.CIRCLE_CROP, aoya.BOOLEAN));
        if (treeMap.containsKey("nd")) {
            alobVar50 = (alob) treeMap.get("nd");
        } else {
            alobVar50 = new alob();
            treeMap.put("nd", alobVar50);
        }
        alobVar50.h(new aoxy(aoyb.NO_DEFAULT_IMAGE, aoya.BOOLEAN));
        if (treeMap.containsKey("ip")) {
            alobVar51 = (alob) treeMap.get("ip");
        } else {
            alobVar51 = new alob();
            treeMap.put("ip", alobVar51);
        }
        alobVar51.h(new aoxy(aoyb.INCLUDE_PUBLIC_METADATA, aoya.BOOLEAN));
        if (treeMap.containsKey("nc")) {
            alobVar52 = (alob) treeMap.get("nc");
        } else {
            alobVar52 = new alob();
            treeMap.put("nc", alobVar52);
        }
        alobVar52.h(new aoxy(aoyb.NO_CORRECT_EXIF_ORIENTATION, aoya.BOOLEAN));
        if (treeMap.containsKey("a")) {
            alobVar53 = (alob) treeMap.get("a");
        } else {
            alobVar53 = new alob();
            treeMap.put("a", alobVar53);
        }
        alobVar53.h(new aoxy(aoyb.SELECT_FRAME_NUMBER, aoya.INTEGER));
        if (treeMap.containsKey("rj")) {
            alobVar54 = (alob) treeMap.get("rj");
        } else {
            alobVar54 = new alob();
            treeMap.put("rj", alobVar54);
        }
        alobVar54.h(new aoxy(aoyb.REQUEST_JPEG, aoya.BOOLEAN));
        if (treeMap.containsKey("rp")) {
            alobVar55 = (alob) treeMap.get("rp");
        } else {
            alobVar55 = new alob();
            treeMap.put("rp", alobVar55);
        }
        alobVar55.h(new aoxy(aoyb.REQUEST_PNG, aoya.BOOLEAN));
        if (treeMap.containsKey("rg")) {
            alobVar56 = (alob) treeMap.get("rg");
        } else {
            alobVar56 = new alob();
            treeMap.put("rg", alobVar56);
        }
        alobVar56.h(new aoxy(aoyb.REQUEST_GIF, aoya.BOOLEAN));
        if (treeMap.containsKey("pd")) {
            alobVar57 = (alob) treeMap.get("pd");
        } else {
            alobVar57 = new alob();
            treeMap.put("pd", alobVar57);
        }
        alobVar57.h(new aoxy(aoyb.PAD, aoya.BOOLEAN));
        if (treeMap.containsKey("pa")) {
            alobVar58 = (alob) treeMap.get("pa");
        } else {
            alobVar58 = new alob();
            treeMap.put("pa", alobVar58);
        }
        alobVar58.h(new aoxy(aoyb.PRESERVE_ASPECT_RATIO, aoya.BOOLEAN));
        if (treeMap.containsKey("m")) {
            alobVar59 = (alob) treeMap.get("m");
        } else {
            alobVar59 = new alob();
            treeMap.put("m", alobVar59);
        }
        alobVar59.h(new aoxy(aoyb.VIDEO_FORMAT, aoya.INTEGER));
        if (treeMap.containsKey("vb")) {
            alobVar60 = (alob) treeMap.get("vb");
        } else {
            alobVar60 = new alob();
            treeMap.put("vb", alobVar60);
        }
        alobVar60.h(new aoxy(aoyb.VIDEO_BEGIN, aoya.LONG));
        if (treeMap.containsKey("vl")) {
            alobVar61 = (alob) treeMap.get("vl");
        } else {
            alobVar61 = new alob();
            treeMap.put("vl", alobVar61);
        }
        alobVar61.h(new aoxy(aoyb.VIDEO_LENGTH, aoya.LONG));
        if (treeMap.containsKey("lf")) {
            alobVar62 = (alob) treeMap.get("lf");
        } else {
            alobVar62 = new alob();
            treeMap.put("lf", alobVar62);
        }
        alobVar62.h(new aoxy(aoyb.LOOSE_FACE_CROP, aoya.BOOLEAN));
        if (treeMap.containsKey("mv")) {
            alobVar63 = (alob) treeMap.get("mv");
        } else {
            alobVar63 = new alob();
            treeMap.put("mv", alobVar63);
        }
        alobVar63.h(new aoxy(aoyb.MATCH_VERSION, aoya.BOOLEAN));
        if (treeMap.containsKey("id")) {
            alobVar64 = (alob) treeMap.get("id");
        } else {
            alobVar64 = new alob();
            treeMap.put("id", alobVar64);
        }
        alobVar64.h(new aoxy(aoyb.IMAGE_DIGEST, aoya.BOOLEAN));
        if (treeMap.containsKey("al")) {
            alobVar65 = (alob) treeMap.get("al");
        } else {
            alobVar65 = new alob();
            treeMap.put("al", alobVar65);
        }
        alobVar65.h(new aoxy(aoyb.AUTOLOOP, aoya.BOOLEAN));
        if (treeMap.containsKey("ic")) {
            alobVar66 = (alob) treeMap.get("ic");
        } else {
            alobVar66 = new alob();
            treeMap.put("ic", alobVar66);
        }
        alobVar66.h(new aoxy(aoyb.INTERNAL_CLIENT, aoya.INTEGER));
        if (treeMap.containsKey("pg")) {
            alobVar67 = (alob) treeMap.get("pg");
        } else {
            alobVar67 = new alob();
            treeMap.put("pg", alobVar67);
        }
        alobVar67.h(new aoxy(aoyb.TILE_PYRAMID_AS_PROTO, aoya.BOOLEAN));
        if (treeMap.containsKey("mo")) {
            alobVar68 = (alob) treeMap.get("mo");
        } else {
            alobVar68 = new alob();
            treeMap.put("mo", alobVar68);
        }
        alobVar68.h(new aoxy(aoyb.MONOGRAM, aoya.BOOLEAN));
        if (treeMap.containsKey("nt0")) {
            alobVar69 = (alob) treeMap.get("nt0");
        } else {
            alobVar69 = new alob();
            treeMap.put("nt0", alobVar69);
        }
        alobVar69.h(new aoxy(aoyb.VERSIONED_TOKEN, aoya.STRING));
        if (treeMap.containsKey("iv")) {
            alobVar70 = (alob) treeMap.get("iv");
        } else {
            alobVar70 = new alob();
            treeMap.put("iv", alobVar70);
        }
        alobVar70.h(new aoxy(aoyb.IMAGE_VERSION, aoya.LONG));
        if (treeMap.containsKey("pi")) {
            alobVar71 = (alob) treeMap.get("pi");
        } else {
            alobVar71 = new alob();
            treeMap.put("pi", alobVar71);
        }
        alobVar71.h(new aoxy(aoyb.PITCH_DEGREES, aoya.FLOAT));
        if (treeMap.containsKey("ya")) {
            alobVar72 = (alob) treeMap.get("ya");
        } else {
            alobVar72 = new alob();
            treeMap.put("ya", alobVar72);
        }
        alobVar72.h(new aoxy(aoyb.YAW_DEGREES, aoya.FLOAT));
        if (treeMap.containsKey("ro")) {
            alobVar73 = (alob) treeMap.get("ro");
        } else {
            alobVar73 = new alob();
            treeMap.put("ro", alobVar73);
        }
        alobVar73.h(new aoxy(aoyb.ROLL_DEGREES, aoya.FLOAT));
        if (treeMap.containsKey("fo")) {
            alobVar74 = (alob) treeMap.get("fo");
        } else {
            alobVar74 = new alob();
            treeMap.put("fo", alobVar74);
        }
        alobVar74.h(new aoxy(aoyb.FOV_DEGREES, aoya.FLOAT));
        if (treeMap.containsKey("df")) {
            alobVar75 = (alob) treeMap.get("df");
        } else {
            alobVar75 = new alob();
            treeMap.put("df", alobVar75);
        }
        alobVar75.h(new aoxy(aoyb.DETECT_FACES, aoya.BOOLEAN));
        if (treeMap.containsKey("mm")) {
            alobVar76 = (alob) treeMap.get("mm");
        } else {
            alobVar76 = new alob();
            treeMap.put("mm", alobVar76);
        }
        alobVar76.h(new aoxy(aoyb.VIDEO_MULTI_FORMAT, aoya.STRING));
        if (treeMap.containsKey("sg")) {
            alobVar77 = (alob) treeMap.get("sg");
        } else {
            alobVar77 = new alob();
            treeMap.put("sg", alobVar77);
        }
        alobVar77.h(new aoxy(aoyb.STRIP_GOOGLE_DATA, aoya.BOOLEAN));
        if (treeMap.containsKey("gd")) {
            alobVar78 = (alob) treeMap.get("gd");
        } else {
            alobVar78 = new alob();
            treeMap.put("gd", alobVar78);
        }
        alobVar78.h(new aoxy(aoyb.PRESERVE_GOOGLE_DATA, aoya.BOOLEAN));
        if (treeMap.containsKey("fm")) {
            alobVar79 = (alob) treeMap.get("fm");
        } else {
            alobVar79 = new alob();
            treeMap.put("fm", alobVar79);
        }
        alobVar79.h(new aoxy(aoyb.FORCE_MONOGRAM, aoya.BOOLEAN));
        if (treeMap.containsKey("ba")) {
            alobVar80 = (alob) treeMap.get("ba");
        } else {
            alobVar80 = new alob();
            treeMap.put("ba", alobVar80);
        }
        alobVar80.h(new aoxy(aoyb.BADGE, aoya.INTEGER));
        if (treeMap.containsKey("br")) {
            alobVar81 = (alob) treeMap.get("br");
        } else {
            alobVar81 = new alob();
            treeMap.put("br", alobVar81);
        }
        alobVar81.h(new aoxy(aoyb.BORDER_RADIUS, aoya.INTEGER));
        if (treeMap.containsKey("bc")) {
            alobVar82 = (alob) treeMap.get("bc");
        } else {
            alobVar82 = new alob();
            treeMap.put("bc", alobVar82);
        }
        alobVar82.h(new aoxy(aoyb.BACKGROUND_COLOR, aoya.PREFIX_HEX));
        if (treeMap.containsKey("pc")) {
            alobVar83 = (alob) treeMap.get("pc");
        } else {
            alobVar83 = new alob();
            treeMap.put("pc", alobVar83);
        }
        alobVar83.h(new aoxy(aoyb.PAD_COLOR, aoya.PREFIX_HEX));
        if (treeMap.containsKey("sc")) {
            alobVar84 = (alob) treeMap.get("sc");
        } else {
            alobVar84 = new alob();
            treeMap.put("sc", alobVar84);
        }
        alobVar84.h(new aoxy(aoyb.SUBSTITUTION_COLOR, aoya.PREFIX_HEX));
        if (treeMap.containsKey("dv")) {
            alobVar85 = (alob) treeMap.get("dv");
        } else {
            alobVar85 = new alob();
            treeMap.put("dv", alobVar85);
        }
        alobVar85.h(new aoxy(aoyb.DOWNLOAD_VIDEO, aoya.BOOLEAN));
        if (treeMap.containsKey("md")) {
            alobVar86 = (alob) treeMap.get("md");
        } else {
            alobVar86 = new alob();
            treeMap.put("md", alobVar86);
        }
        alobVar86.h(new aoxy(aoyb.MONOGRAM_DOGFOOD, aoya.BOOLEAN));
        if (treeMap.containsKey("cp")) {
            alobVar87 = (alob) treeMap.get("cp");
        } else {
            alobVar87 = new alob();
            treeMap.put("cp", alobVar87);
        }
        alobVar87.h(new aoxy(aoyb.COLOR_PROFILE, aoya.INTEGER));
        if (treeMap.containsKey("sm")) {
            alobVar88 = (alob) treeMap.get("sm");
        } else {
            alobVar88 = new alob();
            treeMap.put("sm", alobVar88);
        }
        alobVar88.h(new aoxy(aoyb.STRIP_METADATA, aoya.BOOLEAN));
        if (treeMap.containsKey("cv")) {
            alobVar89 = (alob) treeMap.get("cv");
        } else {
            alobVar89 = new alob();
            treeMap.put("cv", alobVar89);
        }
        alobVar89.h(new aoxy(aoyb.FACE_CROP_VERSION, aoya.INTEGER));
        if (treeMap.containsKey("ng")) {
            alobVar90 = (alob) treeMap.get("ng");
        } else {
            alobVar90 = new alob();
            treeMap.put("ng", alobVar90);
        }
        alobVar90.h(new aoxy(aoyb.STRIP_GEOINFO, aoya.BOOLEAN));
        if (treeMap.containsKey("il")) {
            alobVar91 = (alob) treeMap.get("il");
        } else {
            alobVar91 = new alob();
            treeMap.put("il", alobVar91);
        }
        alobVar91.h(new aoxy(aoyb.IGNORE_LOW_RES_PROFILE_PHOTO, aoya.BOOLEAN));
        if (treeMap.containsKey("lo")) {
            alobVar92 = (alob) treeMap.get("lo");
        } else {
            alobVar92 = new alob();
            treeMap.put("lo", alobVar92);
        }
        alobVar92.h(new aoxy(aoyb.LOSSY, aoya.BOOLEAN));
        if (treeMap.containsKey("vm")) {
            alobVar93 = (alob) treeMap.get("vm");
        } else {
            alobVar93 = new alob();
            treeMap.put("vm", alobVar93);
        }
        alobVar93.h(new aoxy(aoyb.VIDEO_MANIFEST, aoya.BOOLEAN));
        if (treeMap.containsKey("dc")) {
            alobVar94 = (alob) treeMap.get("dc");
        } else {
            alobVar94 = new alob();
            treeMap.put("dc", alobVar94);
        }
        alobVar94.h(new aoxy(aoyb.DEEP_CROP, aoya.FIFE_SAFE_BASE_64));
        if (treeMap.containsKey("rf")) {
            alobVar95 = (alob) treeMap.get("rf");
        } else {
            alobVar95 = new alob();
            treeMap.put("rf", alobVar95);
        }
        alobVar95.h(new aoxy(aoyb.REQUEST_VIDEO_FAST, aoya.BOOLEAN));
        if (treeMap.containsKey("vf")) {
            alobVar96 = (alob) treeMap.get("vf");
        } else {
            alobVar96 = new alob();
            treeMap.put("vf", alobVar96);
        }
        alobVar96.h(new aoxy(aoyb.VIDEO_FORMAT_FILTERS, aoya.STRING));
        if (treeMap.containsKey("ra")) {
            alobVar97 = (alob) treeMap.get("ra");
        } else {
            alobVar97 = new alob();
            treeMap.put("ra", alobVar97);
        }
        alobVar97.h(new aoxy(aoyb.REQUEST_AVIF, aoya.BOOLEAN));
        if (treeMap.containsKey("ckm")) {
            alobVar98 = (alob) treeMap.get("ckm");
        } else {
            alobVar98 = new alob();
            treeMap.put("ckm", alobVar98);
        }
        alobVar98.h(new aoxy(aoyb.DUMMY_CACHE_KEY_MODIFIER, aoya.BOOLEAN));
        if (treeMap.containsKey("gm")) {
            alobVar99 = (alob) treeMap.get("gm");
        } else {
            alobVar99 = new alob();
            treeMap.put("gm", alobVar99);
        }
        alobVar99.h(new aoxy(aoyb.GAIN_MAP, aoya.BOOLEAN));
        if (treeMap.containsKey("ngm")) {
            alobVar100 = (alob) treeMap.get("ngm");
        } else {
            alobVar100 = new alob();
            treeMap.put("ngm", alobVar100);
        }
        alobVar100.h(new aoxy(aoyb.NO_GAIN_MAP, aoya.BOOLEAN));
        if (treeMap.containsKey("em")) {
            alobVar101 = (alob) treeMap.get("em");
        } else {
            alobVar101 = new alob();
            treeMap.put("em", alobVar101);
        }
        alobVar101.h(new aoxy(aoyb.EXPIRATION_TIME_IN_MINUTES, aoya.INTEGER));
        if (treeMap.containsKey("cr")) {
            alobVar102 = (alob) treeMap.get("cr");
        } else {
            alobVar102 = new alob();
            treeMap.put("cr", alobVar102);
        }
        alobVar102.h(new aoxy(aoyb.FORCE_COOKIE_REDIRECT, aoya.BOOLEAN));
        if (treeMap.containsKey("sl")) {
            alobVar103 = (alob) treeMap.get("sl");
        } else {
            alobVar103 = new alob();
            treeMap.put("sl", alobVar103);
        }
        alobVar103.h(new aoxy(aoyb.STORYBOARD_LEVEL, aoya.INTEGER));
        if (treeMap.containsKey("sb")) {
            alobVar104 = (alob) treeMap.get("sb");
        } else {
            alobVar104 = new alob();
            treeMap.put("sb", alobVar104);
        }
        alobVar104.h(new aoxy(aoyb.STORYBOARD_MOSAIC, aoya.INTEGER));
        TreeMap treeMap2 = new TreeMap();
        for (Map.Entry entry : treeMap.entrySet()) {
            treeMap2.put((String) entry.getKey(), alog.D(((alob) entry.getValue()).g()));
        }
        a = DesugarCollections.unmodifiableMap(treeMap2);
    }
}
