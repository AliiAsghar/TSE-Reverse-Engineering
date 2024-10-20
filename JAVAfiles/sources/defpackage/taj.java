package defpackage;

import android.database.Cursor;
import android.net.Uri;
import j$.time.Instant;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class taj extends agmp implements agmq {
    @Deprecated
    public taj(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tak takVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, tan.a, agoxVar, akkwVar, takVar);
    }

    public final vox A() {
        return vox.b(getInt(cI(45, tan.a)));
    }

    public final xxw B() {
        xxw[] values = xxw.values();
        int i = getInt(cI(41, tan.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final Instant C() {
        return uzz.l(getLong(cI(1, tan.a)));
    }

    public final String D() {
        return getString(cI(30, tan.a));
    }

    public final String E() {
        return getString(cI(33, tan.a));
    }

    public final String F() {
        return getString(cI(11, tan.a));
    }

    public final String G() {
        return getString(cI(27, tan.a));
    }

    public final String H() {
        return getString(cI(12, tan.a));
    }

    public final String I() {
        return getString(cI(10, tan.a));
    }

    public final String J() {
        return getString(cI(40, tan.a));
    }

    public final String K() {
        return getString(cI(16, tan.a));
    }

    public final String L() {
        return getString(cI(15, tan.a));
    }

    public final String M() {
        return getString(cI(0, tan.a));
    }

    public final String N() {
        return getString(cI(20, tan.a));
    }

    public final String O() {
        return getString(cI(8, tan.a));
    }

    public final String P() {
        return getString(cI(3, tan.a));
    }

    public final String Q() {
        return getString(cI(35, tan.a));
    }

    public final String R() {
        return getString(cI(14, tan.a));
    }

    public final String S() {
        return getString(cI(9, tan.a));
    }

    public final String T() {
        return getString(cI(25, tan.a));
    }

    public final boolean U() {
        if (getInt(cI(24, tan.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean V() {
        if (getInt(cI(38, tan.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean W() {
        if (getInt(cI(31, tan.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean X() {
        if (getInt(cI(39, tan.a)) == 1) {
            return true;
        }
        return false;
    }

    public final byte[] Y() {
        return getBlob(cI(36, tan.a));
    }

    public final int[] Z() {
        return agnc.w(null, dk(getString(cI(21, tan.a))));
    }

    public final xxw[] aa() {
        int[] dk = dk(getString(cI(41, tan.a)));
        xxw[] values = xxw.values();
        int length = values.length;
        xxw[] xxwVarArr = new xxw[dk.length];
        for (int i = 0; i < dk.length; i++) {
            int i2 = dk[i];
            if (i2 < length) {
                xxwVarArr[i] = values[i2];
            } else {
                throw new IllegalStateException();
            }
        }
        return (xxw[]) agnc.z(null, xxwVarArr, new xxw[0]);
    }

    public final String[] ab() {
        return (String[]) agnc.z(null, dm(getString(cI(30, tan.a))), new String[0]);
    }

    public final String[] ac() {
        return (String[]) agnc.z(null, dm(getString(cI(33, tan.a))), new String[0]);
    }

    public final String[] ad() {
        return (String[]) agnc.z(null, dm(getString(cI(11, tan.a))), new String[0]);
    }

    public final boolean[] ae() {
        return agnc.A(null, dn(getString(cI(24, tan.a))));
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tad();
    }

    public final int c() {
        return getInt(cI(21, tan.a));
    }

    public final int e() {
        return getInt(cI(22, tan.a));
    }

    public final int f() {
        return getInt(cI(23, tan.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        Instant[] instantArr;
        long[] jArr;
        String[] strArr2;
        qwe[] qweVarArr;
        qwe[] qweVarArr2;
        int[] iArr;
        int[] iArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        String[] strArr9;
        String[] strArr10;
        long[] jArr2;
        long[] jArr3;
        String[] strArr11;
        String[] strArr12;
        String[] strArr13;
        String[] strArr14;
        String[] strArr15;
        String[] strArr16;
        int[] iArr3;
        Uri[] uriArr;
        Uri[] uriArr2;
        Uri[] uriArr3;
        long[] jArr4;
        long[] jArr5;
        String[] strArr17;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        boolean[] zArr;
        boolean[] zArr2;
        String[] strArr18;
        final int i;
        String[] strArr19;
        int[] iArr7;
        int[] iArr8;
        final int i2;
        String[] strArr20;
        int[] iArr9;
        int[] iArr10;
        String[] strArr21;
        boolean[] zArr3;
        int[] iArr11;
        String[] strArr22;
        qwe[] qweVarArr3;
        Uri[] uriArr4;
        int[] iArr12;
        String[] strArr23;
        tqr[] tqrVarArr;
        String[] strArr24;
        byte[][] bArr;
        long[] jArr6;
        boolean[] zArr4;
        boolean[] zArr5;
        boolean[] zArr6;
        String[] strArr25;
        xxw[] xxwVarArr;
        byte[][] bArr2;
        xxw[] xxwVarArr2;
        mta[] mtaVarArr;
        mta[] mtaVarArr2;
        int i3;
        rxg[] rxgVarArr;
        rxg[] rxgVarArr2;
        int i4;
        vox[] voxVarArr;
        vox[] voxVarArr2;
        vox[] voxVarArr3;
        vox[] voxVarArr4;
        vov[] vovVarArr;
        int i5;
        ndp[] ndpVarArr;
        long[] jArr7;
        Iterator it;
        ndp ndpVar;
        Uri uri;
        Uri uri2;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            boolean z = this.i.b;
            if (db(0)) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(0, tan.a))), new String[0]);
                } else {
                    strArr = new String[]{M()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new szh(this, 12));
            if (db(1)) {
                if (z) {
                    long[] dl = dl(getString(cI(1, tan.a)));
                    int length2 = dl.length;
                    Instant[] instantArr2 = new Instant[length2];
                    for (int i6 = 0; i6 < length2; i6++) {
                        instantArr2[i6] = uzz.l(dl[i6]);
                    }
                    instantArr = (Instant[]) agnc.z(null, instantArr2, new Instant[0]);
                } else {
                    instantArr = new Instant[]{C()};
                }
            } else {
                instantArr = null;
            }
            agmp.ds(length, instantArr, new szh(this, 14));
            if (db(2)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(2, tan.a))));
                } else {
                    jArr = new long[]{o()};
                }
            } else {
                jArr = null;
            }
            final int i7 = 5;
            agmp.dr(length, jArr, new alhr(this) { // from class: tah
                public final /* synthetic */ taj a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i7) {
                        case 0:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(27)));
                        case 1:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(26)));
                        case 2:
                            return "display_destination:".concat(String.valueOf(this.a.getString(10)));
                        case 3:
                            return "participant_type:".concat(String.valueOf(this.a.getString(28)));
                        case 4:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(29)));
                        case 5:
                            return "operation_type:".concat(String.valueOf(this.a.getString(2)));
                        case 6:
                            return "alias:".concat(String.valueOf(this.a.getString(30)));
                        case 7:
                            return "is_spam:".concat(String.valueOf(this.a.getString(31)));
                        case 8:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(32)));
                        case 9:
                            return "cms_id:".concat(String.valueOf(this.a.getString(33)));
                        case 10:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(34)));
                        case 11:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(35)));
                        case 12:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(36)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(11)));
                        case 14:
                            return "directory_id:".concat(String.valueOf(this.a.getString(37)));
                        case 15:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(38)));
                        case 16:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(39)));
                        case 17:
                            return "participant_id:".concat(String.valueOf(this.a.getString(3)));
                        case 18:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(40)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(41)));
                        default:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(42)));
                    }
                }
            });
            if (db(3)) {
                if (z) {
                    strArr2 = (String[]) agnc.z(null, dm(getString(cI(3, tan.a))), new String[0]);
                } else {
                    strArr2 = new String[]{P()};
                }
            } else {
                strArr2 = null;
            }
            final int i8 = 17;
            agmp.ds(length, strArr2, new alhr(this) { // from class: tah
                public final /* synthetic */ taj a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i8) {
                        case 0:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(27)));
                        case 1:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(26)));
                        case 2:
                            return "display_destination:".concat(String.valueOf(this.a.getString(10)));
                        case 3:
                            return "participant_type:".concat(String.valueOf(this.a.getString(28)));
                        case 4:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(29)));
                        case 5:
                            return "operation_type:".concat(String.valueOf(this.a.getString(2)));
                        case 6:
                            return "alias:".concat(String.valueOf(this.a.getString(30)));
                        case 7:
                            return "is_spam:".concat(String.valueOf(this.a.getString(31)));
                        case 8:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(32)));
                        case 9:
                            return "cms_id:".concat(String.valueOf(this.a.getString(33)));
                        case 10:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(34)));
                        case 11:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(35)));
                        case 12:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(36)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(11)));
                        case 14:
                            return "directory_id:".concat(String.valueOf(this.a.getString(37)));
                        case 15:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(38)));
                        case 16:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(39)));
                        case 17:
                            return "participant_id:".concat(String.valueOf(this.a.getString(3)));
                        case 18:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(40)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(41)));
                        default:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(42)));
                    }
                }
            });
            if (db(4)) {
                if (z) {
                    String[] dm = dm(getString(cI(4, tan.a)));
                    int length3 = dm.length;
                    qwe[] qweVarArr4 = new qwe[length3];
                    for (int i9 = 0; i9 < length3; i9++) {
                        qweVarArr4[i9] = riw.m(dm[i9]);
                    }
                    qweVarArr = (qwe[]) agnc.z(null, qweVarArr4, new qwe[0]);
                } else {
                    qweVarArr = new qwe[]{u()};
                }
            } else {
                qweVarArr = null;
            }
            agmp.ds(length, qweVarArr, new tai(this, 6));
            if (db(5)) {
                if (z) {
                    String[] dm2 = dm(getString(cI(5, tan.a)));
                    int length4 = dm2.length;
                    qwe[] qweVarArr5 = new qwe[length4];
                    for (int i10 = 0; i10 < length4; i10++) {
                        qweVarArr5[i10] = riw.m(dm2[i10]);
                    }
                    qweVarArr2 = (qwe[]) agnc.z(null, qweVarArr5, new qwe[0]);
                } else {
                    qweVarArr2 = new qwe[]{v()};
                }
            } else {
                qweVarArr2 = null;
            }
            agmp.ds(length, qweVarArr2, new tai(this, 7));
            if (db(6)) {
                if (z) {
                    iArr = agnc.w(null, dk(getString(cI(6, tan.a))));
                } else {
                    iArr = new int[]{j()};
                }
            } else {
                iArr = null;
            }
            agmp.dq(length, iArr, new tai(this, 8));
            if (db(7)) {
                if (z) {
                    iArr2 = agnc.w(null, dk(getString(cI(7, tan.a))));
                } else {
                    iArr2 = new int[]{i()};
                }
            } else {
                iArr2 = null;
            }
            agmp.dq(length, iArr2, new tai(this, 9));
            if (db(8)) {
                if (z) {
                    strArr3 = (String[]) agnc.z(null, dm(getString(cI(8, tan.a))), new String[0]);
                } else {
                    strArr3 = new String[]{O()};
                }
            } else {
                strArr3 = null;
            }
            agmp.ds(length, strArr3, new tai(this, 10));
            if (db(9)) {
                if (z) {
                    strArr4 = strArr3;
                    strArr5 = (String[]) agnc.z(null, dm(getString(cI(9, tan.a))), new String[0]);
                } else {
                    strArr4 = strArr3;
                    strArr5 = new String[]{S()};
                }
            } else {
                strArr4 = strArr3;
                strArr5 = null;
            }
            agmp.ds(length, strArr5, new tai(this, 11));
            if (db(10)) {
                if (z) {
                    strArr6 = strArr5;
                    strArr7 = (String[]) agnc.z(null, dm(getString(cI(10, tan.a))), new String[0]);
                } else {
                    strArr6 = strArr5;
                    strArr7 = new String[]{I()};
                }
            } else {
                strArr6 = strArr5;
                strArr7 = null;
            }
            final int i11 = 2;
            agmp.ds(length, strArr7, new alhr(this) { // from class: tah
                public final /* synthetic */ taj a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i11) {
                        case 0:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(27)));
                        case 1:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(26)));
                        case 2:
                            return "display_destination:".concat(String.valueOf(this.a.getString(10)));
                        case 3:
                            return "participant_type:".concat(String.valueOf(this.a.getString(28)));
                        case 4:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(29)));
                        case 5:
                            return "operation_type:".concat(String.valueOf(this.a.getString(2)));
                        case 6:
                            return "alias:".concat(String.valueOf(this.a.getString(30)));
                        case 7:
                            return "is_spam:".concat(String.valueOf(this.a.getString(31)));
                        case 8:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(32)));
                        case 9:
                            return "cms_id:".concat(String.valueOf(this.a.getString(33)));
                        case 10:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(34)));
                        case 11:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(35)));
                        case 12:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(36)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(11)));
                        case 14:
                            return "directory_id:".concat(String.valueOf(this.a.getString(37)));
                        case 15:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(38)));
                        case 16:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(39)));
                        case 17:
                            return "participant_id:".concat(String.valueOf(this.a.getString(3)));
                        case 18:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(40)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(41)));
                        default:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(42)));
                    }
                }
            });
            if (db(11)) {
                if (z) {
                    strArr8 = ad();
                } else {
                    strArr8 = new String[]{F()};
                }
            } else {
                strArr8 = null;
            }
            String[] strArr26 = strArr7;
            final int i12 = 13;
            agmp.ds(length, strArr8, new alhr(this) { // from class: tah
                public final /* synthetic */ taj a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i12) {
                        case 0:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(27)));
                        case 1:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(26)));
                        case 2:
                            return "display_destination:".concat(String.valueOf(this.a.getString(10)));
                        case 3:
                            return "participant_type:".concat(String.valueOf(this.a.getString(28)));
                        case 4:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(29)));
                        case 5:
                            return "operation_type:".concat(String.valueOf(this.a.getString(2)));
                        case 6:
                            return "alias:".concat(String.valueOf(this.a.getString(30)));
                        case 7:
                            return "is_spam:".concat(String.valueOf(this.a.getString(31)));
                        case 8:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(32)));
                        case 9:
                            return "cms_id:".concat(String.valueOf(this.a.getString(33)));
                        case 10:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(34)));
                        case 11:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(35)));
                        case 12:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(36)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(11)));
                        case 14:
                            return "directory_id:".concat(String.valueOf(this.a.getString(37)));
                        case 15:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(38)));
                        case 16:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(39)));
                        case 17:
                            return "participant_id:".concat(String.valueOf(this.a.getString(3)));
                        case 18:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(40)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(41)));
                        default:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(42)));
                    }
                }
            });
            if (db(12)) {
                if (z) {
                    strArr9 = strArr8;
                    strArr10 = (String[]) agnc.z(null, dm(getString(cI(12, tan.a))), new String[0]);
                } else {
                    strArr9 = strArr8;
                    strArr10 = new String[]{H()};
                }
            } else {
                strArr9 = strArr8;
                strArr10 = null;
            }
            agmp.ds(length, strArr10, new tai(this, 3));
            if (db(13)) {
                if (z) {
                    jArr2 = agnc.y(null, dl(getString(cI(13, tan.a))));
                } else {
                    jArr2 = new long[]{p()};
                }
            } else {
                jArr2 = null;
            }
            String[] strArr27 = strArr10;
            agmp.dr(length, jArr2, new tai(this, 12));
            if (db(14)) {
                if (z) {
                    jArr3 = jArr2;
                    strArr11 = (String[]) agnc.z(null, dm(getString(cI(14, tan.a))), new String[0]);
                } else {
                    jArr3 = jArr2;
                    strArr11 = new String[]{R()};
                }
            } else {
                jArr3 = jArr2;
                strArr11 = null;
            }
            agmp.ds(length, strArr11, new tai(this, 13));
            if (db(15)) {
                if (z) {
                    strArr12 = strArr11;
                    strArr13 = (String[]) agnc.z(null, dm(getString(cI(15, tan.a))), new String[0]);
                } else {
                    strArr12 = strArr11;
                    strArr13 = new String[]{L()};
                }
            } else {
                strArr12 = strArr11;
                strArr13 = null;
            }
            agmp.ds(length, strArr13, new tai(this, 14));
            if (db(16)) {
                if (z) {
                    strArr14 = strArr13;
                    strArr15 = (String[]) agnc.z(null, dm(getString(cI(16, tan.a))), new String[0]);
                } else {
                    strArr14 = strArr13;
                    strArr15 = new String[]{K()};
                }
            } else {
                strArr14 = strArr13;
                strArr15 = null;
            }
            agmp.ds(length, strArr15, new tai(this, 15));
            if (db(17)) {
                if (z) {
                    String[] dm3 = dm(getString(cI(17, tan.a)));
                    int length5 = dm3.length;
                    strArr16 = strArr15;
                    Uri[] uriArr5 = new Uri[length5];
                    iArr3 = iArr2;
                    int i13 = 0;
                    int i14 = 0;
                    while (i13 < length5) {
                        String str = dm3[i13];
                        int i15 = i14 + 1;
                        if (str != null && str.length() != 0) {
                            uri2 = Uri.parse(str);
                        } else {
                            uri2 = null;
                        }
                        uriArr5[i14] = uri2;
                        i13++;
                        i14 = i15;
                    }
                    uriArr = (Uri[]) agnc.z(null, uriArr5, new Uri[0]);
                } else {
                    strArr16 = strArr15;
                    iArr3 = iArr2;
                    uriArr = new Uri[]{r()};
                }
            } else {
                strArr16 = strArr15;
                iArr3 = iArr2;
                uriArr = null;
            }
            agmp.ds(length, uriArr, new tai(this, 16));
            if (db(18)) {
                if (z) {
                    String[] dm4 = dm(getString(cI(18, tan.a)));
                    int length6 = dm4.length;
                    Uri[] uriArr6 = new Uri[length6];
                    uriArr2 = uriArr;
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < length6) {
                        String str2 = dm4[i16];
                        int i18 = i17 + 1;
                        if (str2 != null && str2.length() != 0) {
                            uri = Uri.parse(str2);
                        } else {
                            uri = null;
                        }
                        uriArr6[i17] = uri;
                        i16++;
                        i17 = i18;
                    }
                    uriArr3 = (Uri[]) agnc.z(null, uriArr6, new Uri[0]);
                } else {
                    uriArr2 = uriArr;
                    uriArr3 = new Uri[]{q()};
                }
            } else {
                uriArr2 = uriArr;
                uriArr3 = null;
            }
            agmp.ds(length, uriArr3, new tai(this, 17));
            if (db(19)) {
                if (z) {
                    jArr4 = agnc.y(null, dl(getString(cI(19, tan.a))));
                } else {
                    jArr4 = new long[]{m()};
                }
            } else {
                jArr4 = null;
            }
            agmp.dr(length, jArr4, new szh(this, 13));
            if (db(20)) {
                if (z) {
                    jArr5 = jArr4;
                    strArr17 = (String[]) agnc.z(null, dm(getString(cI(20, tan.a))), new String[0]);
                } else {
                    jArr5 = jArr4;
                    strArr17 = new String[]{N()};
                }
            } else {
                jArr5 = jArr4;
                strArr17 = null;
            }
            agmp.ds(length, strArr17, new szh(this, 15));
            if (db(21)) {
                if (z) {
                    iArr4 = Z();
                } else {
                    iArr4 = new int[]{c()};
                }
            } else {
                iArr4 = null;
            }
            String[] strArr28 = strArr17;
            agmp.dq(length, iArr4, new szh(this, 16));
            if (db(22)) {
                if (z) {
                    iArr5 = agnc.w(null, dk(getString(cI(22, tan.a))));
                } else {
                    iArr5 = new int[]{e()};
                }
            } else {
                iArr5 = null;
            }
            int[] iArr13 = iArr4;
            agmp.dq(length, iArr5, new szh(this, 17));
            if (db(23)) {
                if (z) {
                    iArr6 = agnc.w(null, dk(getString(cI(23, tan.a))));
                } else {
                    iArr6 = new int[]{f()};
                }
            } else {
                iArr6 = null;
            }
            int[] iArr14 = iArr5;
            agmp.dq(length, iArr6, new szh(this, 18));
            if (db(24)) {
                if (z) {
                    zArr = ae();
                } else {
                    zArr = new boolean[]{U()};
                }
            } else {
                zArr = null;
            }
            int[] iArr15 = iArr6;
            agmp.dt(length, zArr, new szh(this, 19));
            if (db(25)) {
                if (z) {
                    zArr2 = zArr;
                    strArr18 = (String[]) agnc.z(null, dm(getString(cI(25, tan.a))), new String[0]);
                } else {
                    zArr2 = zArr;
                    strArr18 = new String[]{T()};
                }
            } else {
                zArr2 = zArr;
                strArr18 = null;
            }
            agmp.ds(length, strArr18, new szh(this, 20));
            if (db(26)) {
                if (z) {
                    iArr7 = agnc.w(null, dk(getString(cI(26, tan.a))));
                    strArr19 = strArr18;
                    i = 1;
                } else {
                    i = 1;
                    iArr7 = new int[]{k()};
                    strArr19 = strArr18;
                }
            } else {
                i = 1;
                strArr19 = strArr18;
                iArr7 = null;
            }
            agmp.dq(length, iArr7, new alhr(this) { // from class: tah
                public final /* synthetic */ taj a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i) {
                        case 0:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(27)));
                        case 1:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(26)));
                        case 2:
                            return "display_destination:".concat(String.valueOf(this.a.getString(10)));
                        case 3:
                            return "participant_type:".concat(String.valueOf(this.a.getString(28)));
                        case 4:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(29)));
                        case 5:
                            return "operation_type:".concat(String.valueOf(this.a.getString(2)));
                        case 6:
                            return "alias:".concat(String.valueOf(this.a.getString(30)));
                        case 7:
                            return "is_spam:".concat(String.valueOf(this.a.getString(31)));
                        case 8:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(32)));
                        case 9:
                            return "cms_id:".concat(String.valueOf(this.a.getString(33)));
                        case 10:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(34)));
                        case 11:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(35)));
                        case 12:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(36)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(11)));
                        case 14:
                            return "directory_id:".concat(String.valueOf(this.a.getString(37)));
                        case 15:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(38)));
                        case 16:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(39)));
                        case 17:
                            return "participant_id:".concat(String.valueOf(this.a.getString(3)));
                        case 18:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(40)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(41)));
                        default:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(42)));
                    }
                }
            });
            if (db(27)) {
                if (z) {
                    iArr8 = iArr7;
                    strArr20 = (String[]) agnc.z(null, dm(getString(cI(27, tan.a))), new String[0]);
                    i2 = 0;
                } else {
                    iArr8 = iArr7;
                    i2 = 0;
                    strArr20 = new String[]{G()};
                }
            } else {
                iArr8 = iArr7;
                i2 = 0;
                strArr20 = null;
            }
            agmp.ds(length, strArr20, new alhr(this) { // from class: tah
                public final /* synthetic */ taj a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i2) {
                        case 0:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(27)));
                        case 1:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(26)));
                        case 2:
                            return "display_destination:".concat(String.valueOf(this.a.getString(10)));
                        case 3:
                            return "participant_type:".concat(String.valueOf(this.a.getString(28)));
                        case 4:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(29)));
                        case 5:
                            return "operation_type:".concat(String.valueOf(this.a.getString(2)));
                        case 6:
                            return "alias:".concat(String.valueOf(this.a.getString(30)));
                        case 7:
                            return "is_spam:".concat(String.valueOf(this.a.getString(31)));
                        case 8:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(32)));
                        case 9:
                            return "cms_id:".concat(String.valueOf(this.a.getString(33)));
                        case 10:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(34)));
                        case 11:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(35)));
                        case 12:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(36)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(11)));
                        case 14:
                            return "directory_id:".concat(String.valueOf(this.a.getString(37)));
                        case 15:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(38)));
                        case 16:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(39)));
                        case 17:
                            return "participant_id:".concat(String.valueOf(this.a.getString(3)));
                        case 18:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(40)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(41)));
                        default:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(42)));
                    }
                }
            });
            if (db(28)) {
                if (z) {
                    iArr9 = agnc.w(null, dk(getString(cI(28, tan.a))));
                } else {
                    iArr9 = new int[]{h()};
                }
            } else {
                iArr9 = null;
            }
            String[] strArr29 = strArr20;
            final int i19 = 3;
            agmp.dq(length, iArr9, new alhr(this) { // from class: tah
                public final /* synthetic */ taj a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i19) {
                        case 0:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(27)));
                        case 1:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(26)));
                        case 2:
                            return "display_destination:".concat(String.valueOf(this.a.getString(10)));
                        case 3:
                            return "participant_type:".concat(String.valueOf(this.a.getString(28)));
                        case 4:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(29)));
                        case 5:
                            return "operation_type:".concat(String.valueOf(this.a.getString(2)));
                        case 6:
                            return "alias:".concat(String.valueOf(this.a.getString(30)));
                        case 7:
                            return "is_spam:".concat(String.valueOf(this.a.getString(31)));
                        case 8:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(32)));
                        case 9:
                            return "cms_id:".concat(String.valueOf(this.a.getString(33)));
                        case 10:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(34)));
                        case 11:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(35)));
                        case 12:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(36)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(11)));
                        case 14:
                            return "directory_id:".concat(String.valueOf(this.a.getString(37)));
                        case 15:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(38)));
                        case 16:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(39)));
                        case 17:
                            return "participant_id:".concat(String.valueOf(this.a.getString(3)));
                        case 18:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(40)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(41)));
                        default:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(42)));
                    }
                }
            });
            if (db(29)) {
                if (z) {
                    iArr10 = agnc.w(null, dk(getString(cI(29, tan.a))));
                } else {
                    iArr10 = new int[]{l()};
                }
            } else {
                iArr10 = null;
            }
            int[] iArr16 = iArr9;
            final int i20 = 4;
            agmp.dq(length, iArr10, new alhr(this) { // from class: tah
                public final /* synthetic */ taj a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i20) {
                        case 0:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(27)));
                        case 1:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(26)));
                        case 2:
                            return "display_destination:".concat(String.valueOf(this.a.getString(10)));
                        case 3:
                            return "participant_type:".concat(String.valueOf(this.a.getString(28)));
                        case 4:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(29)));
                        case 5:
                            return "operation_type:".concat(String.valueOf(this.a.getString(2)));
                        case 6:
                            return "alias:".concat(String.valueOf(this.a.getString(30)));
                        case 7:
                            return "is_spam:".concat(String.valueOf(this.a.getString(31)));
                        case 8:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(32)));
                        case 9:
                            return "cms_id:".concat(String.valueOf(this.a.getString(33)));
                        case 10:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(34)));
                        case 11:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(35)));
                        case 12:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(36)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(11)));
                        case 14:
                            return "directory_id:".concat(String.valueOf(this.a.getString(37)));
                        case 15:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(38)));
                        case 16:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(39)));
                        case 17:
                            return "participant_id:".concat(String.valueOf(this.a.getString(3)));
                        case 18:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(40)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(41)));
                        default:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(42)));
                    }
                }
            });
            if (db(30)) {
                if (z) {
                    strArr21 = ab();
                } else {
                    strArr21 = new String[]{D()};
                }
            } else {
                strArr21 = null;
            }
            int[] iArr17 = iArr10;
            final int i21 = 6;
            agmp.ds(length, strArr21, new alhr(this) { // from class: tah
                public final /* synthetic */ taj a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i21) {
                        case 0:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(27)));
                        case 1:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(26)));
                        case 2:
                            return "display_destination:".concat(String.valueOf(this.a.getString(10)));
                        case 3:
                            return "participant_type:".concat(String.valueOf(this.a.getString(28)));
                        case 4:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(29)));
                        case 5:
                            return "operation_type:".concat(String.valueOf(this.a.getString(2)));
                        case 6:
                            return "alias:".concat(String.valueOf(this.a.getString(30)));
                        case 7:
                            return "is_spam:".concat(String.valueOf(this.a.getString(31)));
                        case 8:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(32)));
                        case 9:
                            return "cms_id:".concat(String.valueOf(this.a.getString(33)));
                        case 10:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(34)));
                        case 11:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(35)));
                        case 12:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(36)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(11)));
                        case 14:
                            return "directory_id:".concat(String.valueOf(this.a.getString(37)));
                        case 15:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(38)));
                        case 16:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(39)));
                        case 17:
                            return "participant_id:".concat(String.valueOf(this.a.getString(3)));
                        case 18:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(40)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(41)));
                        default:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(42)));
                    }
                }
            });
            if (db(31)) {
                if (z) {
                    zArr3 = agnc.A(null, dn(getString(cI(31, tan.a))));
                } else {
                    zArr3 = new boolean[]{W()};
                }
            } else {
                zArr3 = null;
            }
            String[] strArr30 = strArr21;
            final int i22 = 7;
            agmp.dt(length, zArr3, new alhr(this) { // from class: tah
                public final /* synthetic */ taj a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i22) {
                        case 0:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(27)));
                        case 1:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(26)));
                        case 2:
                            return "display_destination:".concat(String.valueOf(this.a.getString(10)));
                        case 3:
                            return "participant_type:".concat(String.valueOf(this.a.getString(28)));
                        case 4:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(29)));
                        case 5:
                            return "operation_type:".concat(String.valueOf(this.a.getString(2)));
                        case 6:
                            return "alias:".concat(String.valueOf(this.a.getString(30)));
                        case 7:
                            return "is_spam:".concat(String.valueOf(this.a.getString(31)));
                        case 8:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(32)));
                        case 9:
                            return "cms_id:".concat(String.valueOf(this.a.getString(33)));
                        case 10:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(34)));
                        case 11:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(35)));
                        case 12:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(36)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(11)));
                        case 14:
                            return "directory_id:".concat(String.valueOf(this.a.getString(37)));
                        case 15:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(38)));
                        case 16:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(39)));
                        case 17:
                            return "participant_id:".concat(String.valueOf(this.a.getString(3)));
                        case 18:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(40)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(41)));
                        default:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(42)));
                    }
                }
            });
            if (db(32)) {
                if (z) {
                    iArr11 = agnc.w(null, dk(getString(cI(32, tan.a))));
                } else {
                    iArr11 = new int[]{g()};
                }
            } else {
                iArr11 = null;
            }
            boolean[] zArr7 = zArr3;
            final int i23 = 8;
            agmp.dq(length, iArr11, new alhr(this) { // from class: tah
                public final /* synthetic */ taj a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i23) {
                        case 0:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(27)));
                        case 1:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(26)));
                        case 2:
                            return "display_destination:".concat(String.valueOf(this.a.getString(10)));
                        case 3:
                            return "participant_type:".concat(String.valueOf(this.a.getString(28)));
                        case 4:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(29)));
                        case 5:
                            return "operation_type:".concat(String.valueOf(this.a.getString(2)));
                        case 6:
                            return "alias:".concat(String.valueOf(this.a.getString(30)));
                        case 7:
                            return "is_spam:".concat(String.valueOf(this.a.getString(31)));
                        case 8:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(32)));
                        case 9:
                            return "cms_id:".concat(String.valueOf(this.a.getString(33)));
                        case 10:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(34)));
                        case 11:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(35)));
                        case 12:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(36)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(11)));
                        case 14:
                            return "directory_id:".concat(String.valueOf(this.a.getString(37)));
                        case 15:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(38)));
                        case 16:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(39)));
                        case 17:
                            return "participant_id:".concat(String.valueOf(this.a.getString(3)));
                        case 18:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(40)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(41)));
                        default:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(42)));
                    }
                }
            });
            if (db(33)) {
                if (z) {
                    strArr22 = ac();
                } else {
                    strArr22 = new String[]{E()};
                }
            } else {
                strArr22 = null;
            }
            int[] iArr18 = iArr11;
            final int i24 = 9;
            agmp.ds(length, strArr22, new alhr(this) { // from class: tah
                public final /* synthetic */ taj a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i24) {
                        case 0:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(27)));
                        case 1:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(26)));
                        case 2:
                            return "display_destination:".concat(String.valueOf(this.a.getString(10)));
                        case 3:
                            return "participant_type:".concat(String.valueOf(this.a.getString(28)));
                        case 4:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(29)));
                        case 5:
                            return "operation_type:".concat(String.valueOf(this.a.getString(2)));
                        case 6:
                            return "alias:".concat(String.valueOf(this.a.getString(30)));
                        case 7:
                            return "is_spam:".concat(String.valueOf(this.a.getString(31)));
                        case 8:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(32)));
                        case 9:
                            return "cms_id:".concat(String.valueOf(this.a.getString(33)));
                        case 10:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(34)));
                        case 11:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(35)));
                        case 12:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(36)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(11)));
                        case 14:
                            return "directory_id:".concat(String.valueOf(this.a.getString(37)));
                        case 15:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(38)));
                        case 16:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(39)));
                        case 17:
                            return "participant_id:".concat(String.valueOf(this.a.getString(3)));
                        case 18:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(40)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(41)));
                        default:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(42)));
                    }
                }
            });
            if (db(34)) {
                if (z) {
                    int[] dk = dk(getString(cI(34, tan.a)));
                    tqr[] values = tqr.values();
                    strArr23 = strArr22;
                    int length7 = values.length;
                    uriArr4 = uriArr3;
                    tqr[] tqrVarArr2 = new tqr[dk.length];
                    qweVarArr3 = qweVarArr2;
                    iArr12 = iArr;
                    for (int i25 = 0; i25 < dk.length; i25++) {
                        int i26 = dk[i25];
                        if (i26 < length7) {
                            tqrVarArr2[i25] = values[i26];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    tqrVarArr = (tqr[]) agnc.z(null, tqrVarArr2, new tqr[0]);
                } else {
                    qweVarArr3 = qweVarArr2;
                    uriArr4 = uriArr3;
                    iArr12 = iArr;
                    strArr23 = strArr22;
                    tqrVarArr = new tqr[]{x()};
                }
            } else {
                qweVarArr3 = qweVarArr2;
                uriArr4 = uriArr3;
                iArr12 = iArr;
                strArr23 = strArr22;
                tqrVarArr = null;
            }
            final int i27 = 10;
            agmp.ds(length, tqrVarArr, new alhr(this) { // from class: tah
                public final /* synthetic */ taj a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i27) {
                        case 0:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(27)));
                        case 1:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(26)));
                        case 2:
                            return "display_destination:".concat(String.valueOf(this.a.getString(10)));
                        case 3:
                            return "participant_type:".concat(String.valueOf(this.a.getString(28)));
                        case 4:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(29)));
                        case 5:
                            return "operation_type:".concat(String.valueOf(this.a.getString(2)));
                        case 6:
                            return "alias:".concat(String.valueOf(this.a.getString(30)));
                        case 7:
                            return "is_spam:".concat(String.valueOf(this.a.getString(31)));
                        case 8:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(32)));
                        case 9:
                            return "cms_id:".concat(String.valueOf(this.a.getString(33)));
                        case 10:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(34)));
                        case 11:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(35)));
                        case 12:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(36)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(11)));
                        case 14:
                            return "directory_id:".concat(String.valueOf(this.a.getString(37)));
                        case 15:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(38)));
                        case 16:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(39)));
                        case 17:
                            return "participant_id:".concat(String.valueOf(this.a.getString(3)));
                        case 18:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(40)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(41)));
                        default:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(42)));
                    }
                }
            });
            if (db(35)) {
                if (z) {
                    strArr24 = (String[]) agnc.z(null, dm(getString(cI(35, tan.a))), new String[0]);
                } else {
                    strArr24 = new String[]{Q()};
                }
            } else {
                strArr24 = null;
            }
            final int i28 = 11;
            agmp.ds(length, strArr24, new alhr(this) { // from class: tah
                public final /* synthetic */ taj a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i28) {
                        case 0:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(27)));
                        case 1:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(26)));
                        case 2:
                            return "display_destination:".concat(String.valueOf(this.a.getString(10)));
                        case 3:
                            return "participant_type:".concat(String.valueOf(this.a.getString(28)));
                        case 4:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(29)));
                        case 5:
                            return "operation_type:".concat(String.valueOf(this.a.getString(2)));
                        case 6:
                            return "alias:".concat(String.valueOf(this.a.getString(30)));
                        case 7:
                            return "is_spam:".concat(String.valueOf(this.a.getString(31)));
                        case 8:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(32)));
                        case 9:
                            return "cms_id:".concat(String.valueOf(this.a.getString(33)));
                        case 10:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(34)));
                        case 11:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(35)));
                        case 12:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(36)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(11)));
                        case 14:
                            return "directory_id:".concat(String.valueOf(this.a.getString(37)));
                        case 15:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(38)));
                        case 16:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(39)));
                        case 17:
                            return "participant_id:".concat(String.valueOf(this.a.getString(3)));
                        case 18:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(40)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(41)));
                        default:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(42)));
                    }
                }
            });
            if (db(36)) {
                if (z) {
                    bArr = agnc.B(null, dv(getString(cI(36, tan.a))));
                } else {
                    bArr = new byte[][]{Y()};
                }
            } else {
                bArr = null;
            }
            final int i29 = 12;
            agmp.ds(length, bArr, new alhr(this) { // from class: tah
                public final /* synthetic */ taj a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i29) {
                        case 0:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(27)));
                        case 1:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(26)));
                        case 2:
                            return "display_destination:".concat(String.valueOf(this.a.getString(10)));
                        case 3:
                            return "participant_type:".concat(String.valueOf(this.a.getString(28)));
                        case 4:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(29)));
                        case 5:
                            return "operation_type:".concat(String.valueOf(this.a.getString(2)));
                        case 6:
                            return "alias:".concat(String.valueOf(this.a.getString(30)));
                        case 7:
                            return "is_spam:".concat(String.valueOf(this.a.getString(31)));
                        case 8:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(32)));
                        case 9:
                            return "cms_id:".concat(String.valueOf(this.a.getString(33)));
                        case 10:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(34)));
                        case 11:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(35)));
                        case 12:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(36)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(11)));
                        case 14:
                            return "directory_id:".concat(String.valueOf(this.a.getString(37)));
                        case 15:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(38)));
                        case 16:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(39)));
                        case 17:
                            return "participant_id:".concat(String.valueOf(this.a.getString(3)));
                        case 18:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(40)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(41)));
                        default:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(42)));
                    }
                }
            });
            if (db(37)) {
                if (z) {
                    jArr6 = agnc.y(null, dl(getString(cI(37, tan.a))));
                } else {
                    jArr6 = new long[]{n()};
                }
            } else {
                jArr6 = null;
            }
            final int i30 = 14;
            agmp.dr(length, jArr6, new alhr(this) { // from class: tah
                public final /* synthetic */ taj a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i30) {
                        case 0:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(27)));
                        case 1:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(26)));
                        case 2:
                            return "display_destination:".concat(String.valueOf(this.a.getString(10)));
                        case 3:
                            return "participant_type:".concat(String.valueOf(this.a.getString(28)));
                        case 4:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(29)));
                        case 5:
                            return "operation_type:".concat(String.valueOf(this.a.getString(2)));
                        case 6:
                            return "alias:".concat(String.valueOf(this.a.getString(30)));
                        case 7:
                            return "is_spam:".concat(String.valueOf(this.a.getString(31)));
                        case 8:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(32)));
                        case 9:
                            return "cms_id:".concat(String.valueOf(this.a.getString(33)));
                        case 10:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(34)));
                        case 11:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(35)));
                        case 12:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(36)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(11)));
                        case 14:
                            return "directory_id:".concat(String.valueOf(this.a.getString(37)));
                        case 15:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(38)));
                        case 16:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(39)));
                        case 17:
                            return "participant_id:".concat(String.valueOf(this.a.getString(3)));
                        case 18:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(40)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(41)));
                        default:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(42)));
                    }
                }
            });
            if (db(38)) {
                if (z) {
                    zArr4 = agnc.A(null, dn(getString(cI(38, tan.a))));
                } else {
                    zArr4 = new boolean[]{V()};
                }
            } else {
                zArr4 = null;
            }
            long[] jArr8 = jArr6;
            final int i31 = 15;
            agmp.dt(length, zArr4, new alhr(this) { // from class: tah
                public final /* synthetic */ taj a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i31) {
                        case 0:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(27)));
                        case 1:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(26)));
                        case 2:
                            return "display_destination:".concat(String.valueOf(this.a.getString(10)));
                        case 3:
                            return "participant_type:".concat(String.valueOf(this.a.getString(28)));
                        case 4:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(29)));
                        case 5:
                            return "operation_type:".concat(String.valueOf(this.a.getString(2)));
                        case 6:
                            return "alias:".concat(String.valueOf(this.a.getString(30)));
                        case 7:
                            return "is_spam:".concat(String.valueOf(this.a.getString(31)));
                        case 8:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(32)));
                        case 9:
                            return "cms_id:".concat(String.valueOf(this.a.getString(33)));
                        case 10:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(34)));
                        case 11:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(35)));
                        case 12:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(36)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(11)));
                        case 14:
                            return "directory_id:".concat(String.valueOf(this.a.getString(37)));
                        case 15:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(38)));
                        case 16:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(39)));
                        case 17:
                            return "participant_id:".concat(String.valueOf(this.a.getString(3)));
                        case 18:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(40)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(41)));
                        default:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(42)));
                    }
                }
            });
            if (db(39)) {
                if (z) {
                    zArr5 = agnc.A(null, dn(getString(cI(39, tan.a))));
                } else {
                    zArr5 = new boolean[]{X()};
                }
            } else {
                zArr5 = null;
            }
            boolean[] zArr8 = zArr4;
            final int i32 = 16;
            agmp.dt(length, zArr5, new alhr(this) { // from class: tah
                public final /* synthetic */ taj a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i32) {
                        case 0:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(27)));
                        case 1:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(26)));
                        case 2:
                            return "display_destination:".concat(String.valueOf(this.a.getString(10)));
                        case 3:
                            return "participant_type:".concat(String.valueOf(this.a.getString(28)));
                        case 4:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(29)));
                        case 5:
                            return "operation_type:".concat(String.valueOf(this.a.getString(2)));
                        case 6:
                            return "alias:".concat(String.valueOf(this.a.getString(30)));
                        case 7:
                            return "is_spam:".concat(String.valueOf(this.a.getString(31)));
                        case 8:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(32)));
                        case 9:
                            return "cms_id:".concat(String.valueOf(this.a.getString(33)));
                        case 10:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(34)));
                        case 11:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(35)));
                        case 12:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(36)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(11)));
                        case 14:
                            return "directory_id:".concat(String.valueOf(this.a.getString(37)));
                        case 15:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(38)));
                        case 16:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(39)));
                        case 17:
                            return "participant_id:".concat(String.valueOf(this.a.getString(3)));
                        case 18:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(40)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(41)));
                        default:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(42)));
                    }
                }
            });
            if (db(40)) {
                if (z) {
                    zArr6 = zArr5;
                    strArr25 = (String[]) agnc.z(null, dm(getString(cI(40, tan.a))), new String[0]);
                } else {
                    zArr6 = zArr5;
                    strArr25 = new String[]{J()};
                }
            } else {
                zArr6 = zArr5;
                strArr25 = null;
            }
            final int i33 = 18;
            agmp.ds(length, strArr25, new alhr(this) { // from class: tah
                public final /* synthetic */ taj a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i33) {
                        case 0:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(27)));
                        case 1:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(26)));
                        case 2:
                            return "display_destination:".concat(String.valueOf(this.a.getString(10)));
                        case 3:
                            return "participant_type:".concat(String.valueOf(this.a.getString(28)));
                        case 4:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(29)));
                        case 5:
                            return "operation_type:".concat(String.valueOf(this.a.getString(2)));
                        case 6:
                            return "alias:".concat(String.valueOf(this.a.getString(30)));
                        case 7:
                            return "is_spam:".concat(String.valueOf(this.a.getString(31)));
                        case 8:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(32)));
                        case 9:
                            return "cms_id:".concat(String.valueOf(this.a.getString(33)));
                        case 10:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(34)));
                        case 11:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(35)));
                        case 12:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(36)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(11)));
                        case 14:
                            return "directory_id:".concat(String.valueOf(this.a.getString(37)));
                        case 15:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(38)));
                        case 16:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(39)));
                        case 17:
                            return "participant_id:".concat(String.valueOf(this.a.getString(3)));
                        case 18:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(40)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(41)));
                        default:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(42)));
                    }
                }
            });
            if (db(41)) {
                if (z) {
                    xxwVarArr = aa();
                } else {
                    xxwVarArr = new xxw[]{B()};
                }
            } else {
                xxwVarArr = null;
            }
            String[] strArr31 = strArr25;
            final int i34 = 19;
            agmp.ds(length, xxwVarArr, new alhr(this) { // from class: tah
                public final /* synthetic */ taj a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i34) {
                        case 0:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(27)));
                        case 1:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(26)));
                        case 2:
                            return "display_destination:".concat(String.valueOf(this.a.getString(10)));
                        case 3:
                            return "participant_type:".concat(String.valueOf(this.a.getString(28)));
                        case 4:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(29)));
                        case 5:
                            return "operation_type:".concat(String.valueOf(this.a.getString(2)));
                        case 6:
                            return "alias:".concat(String.valueOf(this.a.getString(30)));
                        case 7:
                            return "is_spam:".concat(String.valueOf(this.a.getString(31)));
                        case 8:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(32)));
                        case 9:
                            return "cms_id:".concat(String.valueOf(this.a.getString(33)));
                        case 10:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(34)));
                        case 11:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(35)));
                        case 12:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(36)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(11)));
                        case 14:
                            return "directory_id:".concat(String.valueOf(this.a.getString(37)));
                        case 15:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(38)));
                        case 16:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(39)));
                        case 17:
                            return "participant_id:".concat(String.valueOf(this.a.getString(3)));
                        case 18:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(40)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(41)));
                        default:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(42)));
                    }
                }
            });
            if (db(42)) {
                if (z) {
                    int[] dk2 = dk(getString(cI(42, tan.a)));
                    mta[] mtaVarArr3 = new mta[dk2.length];
                    bArr2 = bArr;
                    xxwVarArr2 = xxwVarArr;
                    for (int i35 = 0; i35 < dk2.length; i35++) {
                        mta b = mta.b(dk2[i35]);
                        if (b != null) {
                            mtaVarArr3[i35] = b;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    mtaVarArr = (mta[]) agnc.z(null, mtaVarArr3, new mta[0]);
                } else {
                    bArr2 = bArr;
                    xxwVarArr2 = xxwVarArr;
                    mtaVarArr = new mta[]{s()};
                }
            } else {
                bArr2 = bArr;
                xxwVarArr2 = xxwVarArr;
                mtaVarArr = null;
            }
            final int i36 = 20;
            agmp.ds(length, mtaVarArr, new alhr(this) { // from class: tah
                public final /* synthetic */ taj a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i36) {
                        case 0:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(27)));
                        case 1:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(26)));
                        case 2:
                            return "display_destination:".concat(String.valueOf(this.a.getString(10)));
                        case 3:
                            return "participant_type:".concat(String.valueOf(this.a.getString(28)));
                        case 4:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(29)));
                        case 5:
                            return "operation_type:".concat(String.valueOf(this.a.getString(2)));
                        case 6:
                            return "alias:".concat(String.valueOf(this.a.getString(30)));
                        case 7:
                            return "is_spam:".concat(String.valueOf(this.a.getString(31)));
                        case 8:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(32)));
                        case 9:
                            return "cms_id:".concat(String.valueOf(this.a.getString(33)));
                        case 10:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(34)));
                        case 11:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(35)));
                        case 12:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(36)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(11)));
                        case 14:
                            return "directory_id:".concat(String.valueOf(this.a.getString(37)));
                        case 15:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(38)));
                        case 16:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(39)));
                        case 17:
                            return "participant_id:".concat(String.valueOf(this.a.getString(3)));
                        case 18:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(40)));
                        case 19:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(41)));
                        default:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(42)));
                    }
                }
            });
            if (db(43)) {
                if (z) {
                    String[] dm5 = dm(getString(cI(43, tan.a)));
                    int length8 = dm5.length;
                    rxg[] rxgVarArr3 = new rxg[length8];
                    mtaVarArr2 = mtaVarArr;
                    for (int i37 = 0; i37 < length8; i37++) {
                        rxgVarArr3[i37] = vcp.l(dm5[i37]);
                    }
                    rxgVarArr = (rxg[]) agnc.z(null, rxgVarArr3, new rxg[0]);
                    i3 = 1;
                } else {
                    mtaVarArr2 = mtaVarArr;
                    i3 = 1;
                    rxgVarArr = new rxg[]{w()};
                }
            } else {
                mtaVarArr2 = mtaVarArr;
                i3 = 1;
                rxgVarArr = null;
            }
            agmp.ds(length, rxgVarArr, new tai(this, i3));
            if (db(44)) {
                if (z) {
                    int[] dk3 = dk(getString(cI(44, tan.a)));
                    vox[] voxVarArr5 = new vox[dk3.length];
                    rxgVarArr2 = rxgVarArr;
                    for (int i38 = 0; i38 < dk3.length; i38++) {
                        vox b2 = vox.b(dk3[i38]);
                        if (b2 != null) {
                            voxVarArr5[i38] = b2;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    i4 = 0;
                    voxVarArr = (vox[]) agnc.z(null, voxVarArr5, new vox[0]);
                } else {
                    rxgVarArr2 = rxgVarArr;
                    i4 = 0;
                    voxVarArr = new vox[]{z()};
                }
            } else {
                rxgVarArr2 = rxgVarArr;
                i4 = 0;
                voxVarArr = null;
            }
            agmp.ds(length, voxVarArr, new tai(this, i4));
            if (db(45)) {
                if (z) {
                    int[] dk4 = dk(getString(cI(45, tan.a)));
                    vox[] voxVarArr6 = new vox[dk4.length];
                    voxVarArr2 = voxVarArr;
                    for (int i39 = 0; i39 < dk4.length; i39++) {
                        vox b3 = vox.b(dk4[i39]);
                        if (b3 != null) {
                            voxVarArr6[i39] = b3;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    voxVarArr3 = (vox[]) agnc.z(null, voxVarArr6, new vox[0]);
                } else {
                    voxVarArr2 = voxVarArr;
                    voxVarArr3 = new vox[]{A()};
                }
            } else {
                voxVarArr2 = voxVarArr;
                voxVarArr3 = null;
            }
            agmp.ds(length, voxVarArr3, new tai(this, 2));
            if (db(46)) {
                if (z) {
                    int[] dk5 = dk(getString(cI(46, tan.a)));
                    vov[] vovVarArr2 = new vov[dk5.length];
                    voxVarArr4 = voxVarArr3;
                    for (int i40 = 0; i40 < dk5.length; i40++) {
                        vov b4 = vov.b(dk5[i40]);
                        if (b4 != null) {
                            vovVarArr2[i40] = b4;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    vovVarArr = (vov[]) agnc.z(null, vovVarArr2, new vov[0]);
                } else {
                    voxVarArr4 = voxVarArr3;
                    vovVarArr = new vov[]{y()};
                }
            } else {
                voxVarArr4 = voxVarArr3;
                vovVarArr = null;
            }
            agmp.ds(length, vovVarArr, new tai(this, 4));
            if (db(47)) {
                if (z) {
                    List cY = cY(getString(cI(47, tan.a)));
                    ndp[] ndpVarArr2 = new ndp[cY.size()];
                    Iterator it2 = cY.iterator();
                    int i41 = 0;
                    while (it2.hasNext()) {
                        try {
                            byte[] v = agnc.v((String) it2.next());
                            int i42 = i41 + 1;
                            if (v == null) {
                                it = it2;
                                ndpVar = null;
                            } else {
                                it = it2;
                                try {
                                    ndpVar = (ndp) apag.parseFrom(ndp.a, v);
                                } catch (Throwable unused) {
                                    i41 = i42;
                                    ndpVarArr2[i41] = null;
                                    i41++;
                                    it2 = it;
                                }
                            }
                            ndpVarArr2[i41] = ndpVar;
                            it2 = it;
                            i41 = i42;
                        } catch (Throwable unused2) {
                            it = it2;
                        }
                    }
                    i5 = 0;
                    ndpVarArr = (ndp[]) agnc.z(null, ndpVarArr2, new ndp[0]);
                } else {
                    i5 = 0;
                    ndpVarArr = new ndp[]{t()};
                }
            } else {
                i5 = 0;
                ndpVarArr = null;
            }
            agmp.ds(length, ndpVarArr, new tai(this, 5));
            alob alobVar = new alob();
            while (i5 < length) {
                long j = du[i5];
                if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(du[i5]));
                    String[] strArr32 = tan.a;
                    int i43 = sym.a;
                    tae taeVar = new tae();
                    taeVar.aD();
                    taeVar.aB();
                    long j2 = du[i5];
                    if (strArr != null) {
                        taeVar.t(strArr[i5]);
                    }
                    if (instantArr != null) {
                        taeVar.G(instantArr[i5]);
                    }
                    jArr7 = du;
                    if (jArr != null) {
                        taeVar.H(jArr[i5]);
                    }
                    if (strArr2 != null) {
                        taeVar.I(strArr2[i5]);
                    }
                    if (qweVarArr != null) {
                        taeVar.B(qweVarArr[i5]);
                    }
                    if (qweVarArr3 != null) {
                        taeVar.C(qweVarArr3[i5]);
                    }
                    if (iArr12 != null) {
                        taeVar.T(iArr12[i5]);
                    }
                    if (iArr3 != null) {
                        taeVar.S(iArr3[i5]);
                    }
                    if (strArr4 != null) {
                        taeVar.F(strArr4[i5]);
                    }
                    if (strArr6 != null) {
                        taeVar.R(strArr6[i5]);
                    }
                    if (strArr26 != null) {
                        taeVar.o(strArr26[i5]);
                    }
                    if (strArr9 != null) {
                        taeVar.h(strArr9[i5]);
                    }
                    if (strArr27 != null) {
                        taeVar.m(strArr27[i5]);
                    }
                    if (jArr3 != null) {
                        taeVar.Q(jArr3[i5]);
                    }
                    if (strArr12 != null) {
                        taeVar.P(strArr12[i5]);
                    }
                    if (strArr14 != null) {
                        taeVar.s(strArr14[i5]);
                    }
                    if (strArr16 != null) {
                        taeVar.r(strArr16[i5]);
                    }
                    if (uriArr2 != null) {
                        taeVar.N(uriArr2[i5]);
                    }
                    if (uriArr4 != null) {
                        taeVar.l(uriArr4[i5]);
                    }
                    if (jArr5 != null) {
                        taeVar.j(jArr5[i5]);
                    }
                    if (strArr28 != null) {
                        taeVar.A(strArr28[i5]);
                    }
                    if (iArr13 != null) {
                        taeVar.f(iArr13[i5]);
                    }
                    if (iArr14 != null) {
                        taeVar.g(iArr14[i5]);
                    }
                    if (iArr15 != null) {
                        taeVar.q(iArr15[i5]);
                    }
                    if (zArr2 != null) {
                        taeVar.c(zArr2[i5]);
                    }
                    if (strArr19 != null) {
                        String str3 = strArr19[i5];
                        taeVar.aC(25);
                        taeVar.z = str3;
                    }
                    if (iArr8 != null) {
                        taeVar.U(iArr8[i5]);
                    }
                    if (strArr29 != null) {
                        taeVar.i(strArr29[i5]);
                    }
                    if (iArr16 != null) {
                        taeVar.J(iArr16[i5]);
                    }
                    if (iArr17 != null) {
                        int i44 = iArr17[i5];
                        taeVar.aC(29);
                        taeVar.D = i44;
                    }
                    if (strArr30 != null) {
                        taeVar.b(strArr30[i5]);
                    }
                    if (zArr7 != null) {
                        taeVar.v(zArr7[i5]);
                    }
                    if (iArr18 != null) {
                        taeVar.w(iArr18[i5]);
                    }
                    if (strArr23 != null) {
                        taeVar.d(strArr23[i5]);
                    }
                    if (tqrVarArr != null) {
                        taeVar.z(tqrVarArr[i5]);
                    }
                    if (strArr24 != null) {
                        taeVar.L(strArr24[i5]);
                    }
                    if (bArr2 != null) {
                        taeVar.M(bArr2[i5]);
                    }
                    if (jArr8 != null) {
                        taeVar.n(jArr8[i5]);
                    }
                    if (zArr8 != null) {
                        taeVar.u(zArr8[i5]);
                    }
                    if (zArr6 != null) {
                        taeVar.x(zArr6[i5]);
                    }
                    if (strArr31 != null) {
                        taeVar.p(strArr31[i5]);
                    }
                    if (xxwVarArr2 != null) {
                        taeVar.e(xxwVarArr2[i5]);
                    }
                    if (mtaVarArr2 != null) {
                        taeVar.E(mtaVarArr2[i5]);
                    }
                    if (rxgVarArr2 != null) {
                        taeVar.y(rxgVarArr2[i5]);
                    }
                    if (voxVarArr2 != null) {
                        taeVar.D(voxVarArr2[i5]);
                    }
                    if (voxVarArr4 != null) {
                        taeVar.K(voxVarArr4[i5]);
                    }
                    if (vovVarArr != null) {
                        taeVar.O(vovVarArr[i5]);
                    }
                    if (ndpVarArr != null) {
                        taeVar.k(ndpVarArr[i5]);
                    }
                    alobVar.h(taeVar.a());
                } else {
                    jArr7 = du;
                }
                i5++;
                du = jArr7;
            }
            return alobVar.g();
        }
        int i45 = alog.d;
        return alsx.a;
    }

    public final int g() {
        return getInt(cI(32, tan.a));
    }

    public final int h() {
        return getInt(cI(28, tan.a));
    }

    public final int i() {
        return getInt(cI(7, tan.a));
    }

    public final int j() {
        return getInt(cI(6, tan.a));
    }

    public final int k() {
        return getInt(cI(26, tan.a));
    }

    public final int l() {
        return getInt(cI(29, tan.a));
    }

    public final long m() {
        return getLong(cI(19, tan.a));
    }

    public final long n() {
        return getLong(cI(37, tan.a));
    }

    public final long o() {
        return getLong(cI(2, tan.a));
    }

    public final long p() {
        return getLong(cI(13, tan.a));
    }

    public final Uri q() {
        String string = getString(cI(18, tan.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri r() {
        String string = getString(cI(17, tan.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final mta s() {
        return mta.b(getInt(cI(42, tan.a)));
    }

    public final ndp t() {
        byte[] blob = getBlob(cI(47, tan.a));
        if (blob == null) {
            return null;
        }
        try {
            return (ndp) apag.parseFrom(ndp.a, blob, aozs.a());
        } catch (Throwable unused) {
            return ndp.a;
        }
    }

    public final qwe u() {
        return riw.m(getString(cI(4, tan.a)));
    }

    public final qwe v() {
        return riw.m(getString(cI(5, tan.a)));
    }

    public final rxg w() {
        return vcp.l(getString(cI(43, tan.a)));
    }

    public final tqr x() {
        tqr[] values = tqr.values();
        int i = getInt(cI(34, tan.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final vov y() {
        return vov.b(getInt(cI(46, tan.a)));
    }

    public final vox z() {
        return vox.b(getInt(cI(44, tan.a)));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
