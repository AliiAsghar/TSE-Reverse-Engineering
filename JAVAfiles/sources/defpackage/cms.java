package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cms {
    private static final cno A;
    private static final cno B;
    public static final float[] a;
    public static final float[] b;
    public static final cno c;
    public static final cno d;
    public static final cnn e;
    public static final cnn f;
    public static final cnn g;
    public static final cnn h;
    public static final cnn i;
    public static final cnn j;
    public static final cnn k;
    public static final cnn l;
    public static final cnn m;
    public static final cnn n;
    public static final cnn o;
    public static final cnn p;
    public static final cnn q;
    public static final cnn r;
    public static final cmk s;
    public static final cmk t;
    public static final cnn u;
    public static final cnn v;
    public static final cnn w;
    public static final cmk x;
    public static final cmk[] y;
    private static final float[] z;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        z = fArr3;
        cno cnoVar = new cno(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        A = cnoVar;
        cno cnoVar2 = new cno(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        B = cnoVar2;
        cno cnoVar3 = new cno(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = cnoVar3;
        cno cnoVar4 = new cno(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = cnoVar4;
        cnp cnpVar = cmx.a;
        cnn cnnVar = new cnn("sRGB IEC61966-2.1", fArr, cmx.d, cnoVar, 0);
        e = cnnVar;
        cnn cnnVar2 = new cnn("sRGB IEC61966-2.1 (Linear)", fArr, cmx.d, 1.0d, brg.a, 1.0f, 1);
        f = cnnVar2;
        cnn cnnVar3 = new cnn("scRGB-nl IEC 61966-2-2:2003", fArr, cmx.d, null, new cmw() { // from class: cmm
            @Override // defpackage.cmw
            public final double a(double d2) {
                double d3;
                if (d2 < 0.0d) {
                    d3 = -d2;
                } else {
                    d3 = d2;
                }
                return Math.copySign(cml.a(d3, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d), d2);
            }
        }, new cmw() { // from class: cmn
            @Override // defpackage.cmw
            public final double a(double d2) {
                double d3;
                if (d2 < 0.0d) {
                    d3 = -d2;
                } else {
                    d3 = d2;
                }
                return Math.copySign(cml.b(d3, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d), d2);
            }
        }, -0.799f, 2.399f, cnoVar, 2);
        g = cnnVar3;
        cnn cnnVar4 = new cnn("scRGB IEC 61966-2-2:2003", fArr, cmx.d, 1.0d, -0.5f, 7.499f, 3);
        h = cnnVar4;
        double d2 = 0.2222222222222222d;
        double d3 = 0.081d;
        cnn cnnVar5 = new cnn("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, cmx.d, new cno(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, d2, d3), 4);
        i = cnnVar5;
        cnn cnnVar6 = new cnn("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, cmx.d, new cno(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = cnnVar6;
        cnn cnnVar7 = new cnn("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new cnp(0.314f, 0.351f), 2.6d, brg.a, 1.0f, 6);
        k = cnnVar7;
        cnn cnnVar8 = new cnn("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, cmx.d, cnoVar, 7);
        l = cnnVar8;
        cnn cnnVar9 = new cnn("NTSC (1953)", fArr2, cmx.a, new cno(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        m = cnnVar9;
        cnn cnnVar10 = new cnn("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, cmx.d, new cno(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, d2, d3), 9);
        n = cnnVar10;
        cnn cnnVar11 = new cnn("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, cmx.d, 2.2d, brg.a, 1.0f, 10);
        o = cnnVar11;
        cnn cnnVar12 = new cnn("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, cmx.b, new cno(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = cnnVar12;
        cnn cnnVar13 = new cnn("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, brg.a, 1.0f, 1.0E-4f, -0.077f}, cmx.c, 1.0d, -65504.0f, 65504.0f, 12);
        q = cnnVar13;
        cnn cnnVar14 = new cnn("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, cmx.c, 1.0d, -65504.0f, 65504.0f, 13);
        r = cnnVar14;
        cnq cnqVar = new cnq();
        s = cnqVar;
        cmy cmyVar = new cmy();
        t = cmyVar;
        cnn cnnVar15 = new cnn("None", fArr, cmx.d, cnoVar2, 16);
        u = cnnVar15;
        cnn cnnVar16 = new cnn("Hybrid Log Gamma encoding", fArr3, cmx.d, null, new cmw() { // from class: cmo
            @Override // defpackage.cmw
            public final double a(double d4) {
                return cms.b(cms.c, d4);
            }
        }, new cmw() { // from class: cmp
            @Override // defpackage.cmw
            public final double a(double d4) {
                return cms.a(cms.c, d4);
            }
        }, brg.a, 1.0f, cnoVar3, 17);
        v = cnnVar16;
        cnn cnnVar17 = new cnn("Perceptual Quantizer encoding", fArr3, cmx.d, null, new cmw() { // from class: cmq
            @Override // defpackage.cmw
            public final double a(double d4) {
                return cms.d(cms.d, d4);
            }
        }, new cmw() { // from class: cmr
            @Override // defpackage.cmw
            public final double a(double d4) {
                return cms.c(cms.d, d4);
            }
        }, brg.a, 1.0f, cnoVar4, 18);
        w = cnnVar17;
        cmz cmzVar = new cmz();
        x = cmzVar;
        y = new cmk[]{cnnVar, cnnVar2, cnnVar3, cnnVar4, cnnVar5, cnnVar6, cnnVar7, cnnVar8, cnnVar9, cnnVar10, cnnVar11, cnnVar12, cnnVar13, cnnVar14, cnqVar, cmyVar, cnnVar15, cnnVar16, cnnVar17, cmzVar};
    }

    public static final double a(cno cnoVar, double d2) {
        double d3;
        double exp;
        double d4 = cnoVar.g + 1.0d;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d5 = d2 * d3;
        double d6 = cnoVar.b * d5;
        if (d6 <= 1.0d) {
            exp = Math.pow(d6, cnoVar.c);
        } else {
            exp = Math.exp((d5 - cnoVar.f) * cnoVar.d) + cnoVar.e;
        }
        return d4 * d3 * exp;
    }

    public static final double b(cno cnoVar, double d2) {
        double d3;
        double log;
        double d4 = 1.0d / cnoVar.b;
        double d5 = 1.0d / cnoVar.c;
        double d6 = 1.0d / cnoVar.d;
        double d7 = cnoVar.g + 1.0d;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d8 = (d2 * d3) / d7;
        if (d8 <= 1.0d) {
            log = d4 * Math.pow(d8, d5);
        } else {
            log = cnoVar.f + (d6 * Math.log(d8 - cnoVar.e));
        }
        return d3 * log;
    }

    public static final double c(cno cnoVar, double d2) {
        double d3;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d4 = d2 * d3;
        double pow = cnoVar.b + (cnoVar.c * Math.pow(d4, cnoVar.d));
        return d3 * Math.pow(arrn.m(pow, 0.0d) / (cnoVar.e + (cnoVar.f * Math.pow(d4, cnoVar.d))), cnoVar.g);
    }

    public static final double d(cno cnoVar, double d2) {
        double d3 = -cnoVar.b;
        double d4 = 1.0d;
        double d5 = 1.0d / cnoVar.g;
        double d6 = -cnoVar.f;
        double d7 = 1.0d / cnoVar.d;
        if (d2 < 0.0d) {
            d4 = -1.0d;
        }
        double d8 = d2 * d4;
        return d4 * Math.pow(Math.max(d3 + (cnoVar.e * Math.pow(d8, d5)), 0.0d) / (cnoVar.c + (d6 * Math.pow(d8, d5))), d7);
    }
}
