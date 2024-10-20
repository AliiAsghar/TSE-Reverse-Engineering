package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tav extends agmp<tav, tay, taz, ParticipantsTable.BindData, tas> implements agmq {
    @Deprecated
    public tav(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tay tayVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, ParticipantsTable.a, agoxVar, akkwVar, tayVar);
    }

    public final xxw A() {
        xxw[] values = xxw.values();
        int i = getInt(cI(38, ParticipantsTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String B() {
        return getString(cI(27, ParticipantsTable.a));
    }

    public final String C() {
        return getString(cI(30, ParticipantsTable.a));
    }

    public final String D() {
        return yta.a(getString(cI(8, ParticipantsTable.a)));
    }

    public final String E() {
        return getString(cI(24, ParticipantsTable.a));
    }

    public final String F() {
        return yta.a(getString(cI(9, ParticipantsTable.a)));
    }

    public final String G() {
        return aabr.bb(getString(cI(7, ParticipantsTable.a)));
    }

    public final String H() {
        return getString(cI(37, ParticipantsTable.a));
    }

    public final String I() {
        return yta.a(getString(cI(13, ParticipantsTable.a)));
    }

    public final String J() {
        return yta.a(getString(cI(12, ParticipantsTable.a)));
    }

    public final String K() {
        return getString(cI(0, ParticipantsTable.a));
    }

    public final String L() {
        return getString(cI(17, ParticipantsTable.a));
    }

    public final String M() {
        return aabr.bb(getString(cI(5, ParticipantsTable.a)));
    }

    public final String N() {
        return getString(cI(32, ParticipantsTable.a));
    }

    public final String O() {
        return getString(cI(11, ParticipantsTable.a));
    }

    public final String P() {
        return aabr.bb(getString(cI(6, ParticipantsTable.a)));
    }

    public final String Q() {
        return getString(cI(22, ParticipantsTable.a));
    }

    public final boolean R() {
        if (getInt(cI(21, ParticipantsTable.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean S() {
        if (getInt(cI(35, ParticipantsTable.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        if (getInt(cI(28, ParticipantsTable.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean U() {
        if (getInt(cI(36, ParticipantsTable.a)) == 1) {
            return true;
        }
        return false;
    }

    public final byte[] V() {
        return getBlob(cI(33, ParticipantsTable.a));
    }

    public final xxw[] W() {
        int[] dk = dk(getString(cI(38, ParticipantsTable.a)));
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

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tao();
    }

    public final int c() {
        return getInt(cI(18, ParticipantsTable.a));
    }

    public final int e() {
        return getInt(cI(19, ParticipantsTable.a));
    }

    public final int f() {
        return getInt(cI(20, ParticipantsTable.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        qwe[] qweVarArr;
        qwe[] qweVarArr2;
        int[] iArr;
        int[] iArr2;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        long[] jArr;
        long[] jArr2;
        String[] strArr8;
        String[] strArr9;
        String[] strArr10;
        String[] strArr11;
        String[] strArr12;
        String[] strArr13;
        String[] strArr14;
        Uri[] uriArr;
        Uri[] uriArr2;
        Uri[] uriArr3;
        long[] jArr3;
        long[] jArr4;
        String[] strArr15;
        int[] iArr3;
        int[] iArr4;
        final int i;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        final int i2;
        boolean[] zArr;
        boolean[] zArr2;
        String[] strArr16;
        int[] iArr8;
        int[] iArr9;
        String[] strArr17;
        int[] iArr10;
        int[] iArr11;
        int[] iArr12;
        String[] strArr18;
        boolean[] zArr3;
        int[] iArr13;
        int[] iArr14;
        String[] strArr19;
        String[] strArr20;
        String[] strArr21;
        String[] strArr22;
        Uri[] uriArr4;
        tqr[] tqrVarArr;
        String[] strArr23;
        byte[][] bArr;
        long[] jArr5;
        boolean[] zArr4;
        boolean[] zArr5;
        boolean[] zArr6;
        String[] strArr24;
        final int i3;
        String[] strArr25;
        xxw[] xxwVarArr;
        byte[][] bArr2;
        xxw[] xxwVarArr2;
        final int i4;
        mta[] mtaVarArr;
        mta[] mtaVarArr2;
        rxg[] rxgVarArr;
        rxg[] rxgVarArr2;
        vox[] voxVarArr;
        vox[] voxVarArr2;
        vox[] voxVarArr3;
        vox[] voxVarArr4;
        vov[] vovVarArr;
        int i5;
        ndp[] ndpVarArr;
        long[] jArr6;
        Iterator it;
        ndp ndpVar;
        Uri uri;
        Uri uri2;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0 && (length != 1 || du[0] != -1)) {
            HashSet hashSet = new HashSet();
            akkw akkwVar = this.i;
            boolean db = db(0);
            boolean z = akkwVar.b;
            if (db) {
                if (z) {
                    strArr = (String[]) agnc.z(null, dm(getString(cI(0, ParticipantsTable.a))), new String[0]);
                } else {
                    strArr = new String[]{K()};
                }
            } else {
                strArr = null;
            }
            agmp.ds(length, strArr, new tai(this, 18));
            if (db(1)) {
                if (z) {
                    String[] dm = dm(getString(cI(1, ParticipantsTable.a)));
                    int length2 = dm.length;
                    qwe[] qweVarArr3 = new qwe[length2];
                    for (int i6 = 0; i6 < length2; i6++) {
                        qweVarArr3[i6] = riw.m(dm[i6]);
                    }
                    qweVarArr = (qwe[]) agnc.z(null, qweVarArr3, new qwe[0]);
                } else {
                    qweVarArr = new qwe[]{t()};
                }
            } else {
                qweVarArr = null;
            }
            agmp.ds(length, qweVarArr, new tai(this, 20));
            final int i7 = 2;
            if (db(2)) {
                if (z) {
                    String[] dm2 = dm(getString(cI(2, ParticipantsTable.a)));
                    int length3 = dm2.length;
                    qwe[] qweVarArr4 = new qwe[length3];
                    for (int i8 = 0; i8 < length3; i8++) {
                        qweVarArr4[i8] = riw.m(dm2[i8]);
                    }
                    qweVarArr2 = (qwe[]) agnc.z(null, qweVarArr4, new qwe[0]);
                } else {
                    qweVarArr2 = new qwe[]{u()};
                }
            } else {
                qweVarArr2 = null;
            }
            final int i9 = 11;
            agmp.ds(length, qweVarArr2, new alhr(this) { // from class: tat
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i9) {
                        case 0:
                            return "blocked:".concat(String.valueOf(this.a.getString(21)));
                        case 1:
                            return "extended_color:".concat(String.valueOf(this.a.getString(20)));
                        case 2:
                            return "subscription_name:".concat(String.valueOf(this.a.getString(22)));
                        case 3:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(23)));
                        case 4:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(24)));
                        case 5:
                            return "participant_type:".concat(String.valueOf(this.a.getString(25)));
                        case 6:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(26)));
                        case 7:
                            return "alias:".concat(String.valueOf(this.a.getString(27)));
                        case 8:
                            return "recipient_id:".concat(String.valueOf(this.a.getString(10)));
                        case 9:
                            return "is_spam:".concat(String.valueOf(this.a.getString(28)));
                        case 10:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(29)));
                        case 11:
                            return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(2)));
                        case 12:
                            return "cms_id:".concat(String.valueOf(this.a.getString(30)));
                        case 13:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(31)));
                        case 14:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(32)));
                        case 15:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(33)));
                        case 16:
                            return "directory_id:".concat(String.valueOf(this.a.getString(34)));
                        case 17:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(35)));
                        case 18:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(36)));
                        case 19:
                            return "recipient_canonical_address:".concat(String.valueOf(this.a.getString(11)));
                        default:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(37)));
                    }
                }
            });
            if (db(3)) {
                if (z) {
                    iArr = agnc.w(null, dk(getString(cI(3, ParticipantsTable.a))));
                } else {
                    iArr = new int[]{j()};
                }
            } else {
                iArr = null;
            }
            agmp.dq(length, iArr, new alhr(this) { // from class: tau
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i7) {
                        case 0:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(39)));
                        case 1:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(38)));
                        case 2:
                            return "sub_id:".concat(String.valueOf(this.a.getString(3)));
                        case 3:
                            return "last_modified_by_key:".concat(String.valueOf(this.a.getString(40)));
                        case 4:
                            return "name_source:".concat(String.valueOf(this.a.getString(41)));
                        case 5:
                            return "photo_source:".concat(String.valueOf(this.a.getString(42)));
                        case 6:
                            return "profile_photo_user_preference:".concat(String.valueOf(this.a.getString(43)));
                        case 7:
                            return "contact_metadata:".concat(String.valueOf(this.a.getString(44)));
                        case 8:
                            return "sim_slot_id:".concat(String.valueOf(this.a.getString(4)));
                        case 9:
                            return "full_name:".concat(String.valueOf(this.a.getString(12)));
                        case 10:
                            return "normalized_destination:".concat(String.valueOf(this.a.getString(5)));
                        case 11:
                            return "send_destination:".concat(String.valueOf(this.a.getString(6)));
                        case 12:
                            return "display_destination:".concat(String.valueOf(this.a.getString(7)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(8)));
                        case 14:
                            return "country_code:".concat(String.valueOf(this.a.getString(9)));
                        case 15:
                            return "first_name:".concat(String.valueOf(this.a.getString(13)));
                        case 16:
                            return "profile_photo_uri:".concat(String.valueOf(this.a.getString(14)));
                        case 17:
                            return "contact_photo_uri:".concat(String.valueOf(this.a.getString(15)));
                        case 18:
                            return "contact_id:".concat(String.valueOf(this.a.getString(16)));
                        case 19:
                            return "lookup_key:".concat(String.valueOf(this.a.getString(17)));
                        default:
                            return "color_palette_index:".concat(String.valueOf(this.a.getString(18)));
                    }
                }
            });
            if (db(4)) {
                if (z) {
                    iArr2 = agnc.w(null, dk(getString(cI(4, ParticipantsTable.a))));
                } else {
                    iArr2 = new int[]{i()};
                }
            } else {
                iArr2 = null;
            }
            final int i10 = 8;
            agmp.dq(length, iArr2, new alhr(this) { // from class: tau
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i10) {
                        case 0:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(39)));
                        case 1:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(38)));
                        case 2:
                            return "sub_id:".concat(String.valueOf(this.a.getString(3)));
                        case 3:
                            return "last_modified_by_key:".concat(String.valueOf(this.a.getString(40)));
                        case 4:
                            return "name_source:".concat(String.valueOf(this.a.getString(41)));
                        case 5:
                            return "photo_source:".concat(String.valueOf(this.a.getString(42)));
                        case 6:
                            return "profile_photo_user_preference:".concat(String.valueOf(this.a.getString(43)));
                        case 7:
                            return "contact_metadata:".concat(String.valueOf(this.a.getString(44)));
                        case 8:
                            return "sim_slot_id:".concat(String.valueOf(this.a.getString(4)));
                        case 9:
                            return "full_name:".concat(String.valueOf(this.a.getString(12)));
                        case 10:
                            return "normalized_destination:".concat(String.valueOf(this.a.getString(5)));
                        case 11:
                            return "send_destination:".concat(String.valueOf(this.a.getString(6)));
                        case 12:
                            return "display_destination:".concat(String.valueOf(this.a.getString(7)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(8)));
                        case 14:
                            return "country_code:".concat(String.valueOf(this.a.getString(9)));
                        case 15:
                            return "first_name:".concat(String.valueOf(this.a.getString(13)));
                        case 16:
                            return "profile_photo_uri:".concat(String.valueOf(this.a.getString(14)));
                        case 17:
                            return "contact_photo_uri:".concat(String.valueOf(this.a.getString(15)));
                        case 18:
                            return "contact_id:".concat(String.valueOf(this.a.getString(16)));
                        case 19:
                            return "lookup_key:".concat(String.valueOf(this.a.getString(17)));
                        default:
                            return "color_palette_index:".concat(String.valueOf(this.a.getString(18)));
                    }
                }
            });
            if (db(5)) {
                if (z) {
                    String[] dm3 = dm(getString(cI(5, ParticipantsTable.a)));
                    for (int i11 = 0; i11 < dm3.length; i11++) {
                        dm3[i11] = aabr.bb(dm3[i11]);
                    }
                    strArr2 = (String[]) agnc.z(null, dm3, new String[0]);
                } else {
                    strArr2 = new String[]{M()};
                }
            } else {
                strArr2 = null;
            }
            final int i12 = 10;
            agmp.ds(length, strArr2, new alhr(this) { // from class: tau
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i12) {
                        case 0:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(39)));
                        case 1:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(38)));
                        case 2:
                            return "sub_id:".concat(String.valueOf(this.a.getString(3)));
                        case 3:
                            return "last_modified_by_key:".concat(String.valueOf(this.a.getString(40)));
                        case 4:
                            return "name_source:".concat(String.valueOf(this.a.getString(41)));
                        case 5:
                            return "photo_source:".concat(String.valueOf(this.a.getString(42)));
                        case 6:
                            return "profile_photo_user_preference:".concat(String.valueOf(this.a.getString(43)));
                        case 7:
                            return "contact_metadata:".concat(String.valueOf(this.a.getString(44)));
                        case 8:
                            return "sim_slot_id:".concat(String.valueOf(this.a.getString(4)));
                        case 9:
                            return "full_name:".concat(String.valueOf(this.a.getString(12)));
                        case 10:
                            return "normalized_destination:".concat(String.valueOf(this.a.getString(5)));
                        case 11:
                            return "send_destination:".concat(String.valueOf(this.a.getString(6)));
                        case 12:
                            return "display_destination:".concat(String.valueOf(this.a.getString(7)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(8)));
                        case 14:
                            return "country_code:".concat(String.valueOf(this.a.getString(9)));
                        case 15:
                            return "first_name:".concat(String.valueOf(this.a.getString(13)));
                        case 16:
                            return "profile_photo_uri:".concat(String.valueOf(this.a.getString(14)));
                        case 17:
                            return "contact_photo_uri:".concat(String.valueOf(this.a.getString(15)));
                        case 18:
                            return "contact_id:".concat(String.valueOf(this.a.getString(16)));
                        case 19:
                            return "lookup_key:".concat(String.valueOf(this.a.getString(17)));
                        default:
                            return "color_palette_index:".concat(String.valueOf(this.a.getString(18)));
                    }
                }
            });
            if (db(6)) {
                if (z) {
                    String[] dm4 = dm(getString(cI(6, ParticipantsTable.a)));
                    for (int i13 = 0; i13 < dm4.length; i13++) {
                        dm4[i13] = aabr.bb(dm4[i13]);
                    }
                    strArr3 = (String[]) agnc.z(null, dm4, new String[0]);
                } else {
                    strArr3 = new String[]{P()};
                }
            } else {
                strArr3 = null;
            }
            final int i14 = 11;
            agmp.ds(length, strArr3, new alhr(this) { // from class: tau
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i14) {
                        case 0:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(39)));
                        case 1:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(38)));
                        case 2:
                            return "sub_id:".concat(String.valueOf(this.a.getString(3)));
                        case 3:
                            return "last_modified_by_key:".concat(String.valueOf(this.a.getString(40)));
                        case 4:
                            return "name_source:".concat(String.valueOf(this.a.getString(41)));
                        case 5:
                            return "photo_source:".concat(String.valueOf(this.a.getString(42)));
                        case 6:
                            return "profile_photo_user_preference:".concat(String.valueOf(this.a.getString(43)));
                        case 7:
                            return "contact_metadata:".concat(String.valueOf(this.a.getString(44)));
                        case 8:
                            return "sim_slot_id:".concat(String.valueOf(this.a.getString(4)));
                        case 9:
                            return "full_name:".concat(String.valueOf(this.a.getString(12)));
                        case 10:
                            return "normalized_destination:".concat(String.valueOf(this.a.getString(5)));
                        case 11:
                            return "send_destination:".concat(String.valueOf(this.a.getString(6)));
                        case 12:
                            return "display_destination:".concat(String.valueOf(this.a.getString(7)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(8)));
                        case 14:
                            return "country_code:".concat(String.valueOf(this.a.getString(9)));
                        case 15:
                            return "first_name:".concat(String.valueOf(this.a.getString(13)));
                        case 16:
                            return "profile_photo_uri:".concat(String.valueOf(this.a.getString(14)));
                        case 17:
                            return "contact_photo_uri:".concat(String.valueOf(this.a.getString(15)));
                        case 18:
                            return "contact_id:".concat(String.valueOf(this.a.getString(16)));
                        case 19:
                            return "lookup_key:".concat(String.valueOf(this.a.getString(17)));
                        default:
                            return "color_palette_index:".concat(String.valueOf(this.a.getString(18)));
                    }
                }
            });
            if (db(7)) {
                if (z) {
                    String[] dm5 = dm(getString(cI(7, ParticipantsTable.a)));
                    for (int i15 = 0; i15 < dm5.length; i15++) {
                        dm5[i15] = aabr.bb(dm5[i15]);
                    }
                    strArr4 = (String[]) agnc.z(null, dm5, new String[0]);
                } else {
                    strArr4 = new String[]{G()};
                }
            } else {
                strArr4 = null;
            }
            final int i16 = 12;
            agmp.ds(length, strArr4, new alhr(this) { // from class: tau
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i16) {
                        case 0:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(39)));
                        case 1:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(38)));
                        case 2:
                            return "sub_id:".concat(String.valueOf(this.a.getString(3)));
                        case 3:
                            return "last_modified_by_key:".concat(String.valueOf(this.a.getString(40)));
                        case 4:
                            return "name_source:".concat(String.valueOf(this.a.getString(41)));
                        case 5:
                            return "photo_source:".concat(String.valueOf(this.a.getString(42)));
                        case 6:
                            return "profile_photo_user_preference:".concat(String.valueOf(this.a.getString(43)));
                        case 7:
                            return "contact_metadata:".concat(String.valueOf(this.a.getString(44)));
                        case 8:
                            return "sim_slot_id:".concat(String.valueOf(this.a.getString(4)));
                        case 9:
                            return "full_name:".concat(String.valueOf(this.a.getString(12)));
                        case 10:
                            return "normalized_destination:".concat(String.valueOf(this.a.getString(5)));
                        case 11:
                            return "send_destination:".concat(String.valueOf(this.a.getString(6)));
                        case 12:
                            return "display_destination:".concat(String.valueOf(this.a.getString(7)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(8)));
                        case 14:
                            return "country_code:".concat(String.valueOf(this.a.getString(9)));
                        case 15:
                            return "first_name:".concat(String.valueOf(this.a.getString(13)));
                        case 16:
                            return "profile_photo_uri:".concat(String.valueOf(this.a.getString(14)));
                        case 17:
                            return "contact_photo_uri:".concat(String.valueOf(this.a.getString(15)));
                        case 18:
                            return "contact_id:".concat(String.valueOf(this.a.getString(16)));
                        case 19:
                            return "lookup_key:".concat(String.valueOf(this.a.getString(17)));
                        default:
                            return "color_palette_index:".concat(String.valueOf(this.a.getString(18)));
                    }
                }
            });
            if (db(8)) {
                if (z) {
                    String[] dm6 = dm(getString(cI(8, ParticipantsTable.a)));
                    for (int i17 = 0; i17 < dm6.length; i17++) {
                        dm6[i17] = yta.a(dm6[i17]);
                    }
                    strArr5 = (String[]) agnc.z(null, dm6, new String[0]);
                } else {
                    strArr5 = new String[]{D()};
                }
            } else {
                strArr5 = null;
            }
            final int i18 = 13;
            agmp.ds(length, strArr5, new alhr(this) { // from class: tau
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i18) {
                        case 0:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(39)));
                        case 1:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(38)));
                        case 2:
                            return "sub_id:".concat(String.valueOf(this.a.getString(3)));
                        case 3:
                            return "last_modified_by_key:".concat(String.valueOf(this.a.getString(40)));
                        case 4:
                            return "name_source:".concat(String.valueOf(this.a.getString(41)));
                        case 5:
                            return "photo_source:".concat(String.valueOf(this.a.getString(42)));
                        case 6:
                            return "profile_photo_user_preference:".concat(String.valueOf(this.a.getString(43)));
                        case 7:
                            return "contact_metadata:".concat(String.valueOf(this.a.getString(44)));
                        case 8:
                            return "sim_slot_id:".concat(String.valueOf(this.a.getString(4)));
                        case 9:
                            return "full_name:".concat(String.valueOf(this.a.getString(12)));
                        case 10:
                            return "normalized_destination:".concat(String.valueOf(this.a.getString(5)));
                        case 11:
                            return "send_destination:".concat(String.valueOf(this.a.getString(6)));
                        case 12:
                            return "display_destination:".concat(String.valueOf(this.a.getString(7)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(8)));
                        case 14:
                            return "country_code:".concat(String.valueOf(this.a.getString(9)));
                        case 15:
                            return "first_name:".concat(String.valueOf(this.a.getString(13)));
                        case 16:
                            return "profile_photo_uri:".concat(String.valueOf(this.a.getString(14)));
                        case 17:
                            return "contact_photo_uri:".concat(String.valueOf(this.a.getString(15)));
                        case 18:
                            return "contact_id:".concat(String.valueOf(this.a.getString(16)));
                        case 19:
                            return "lookup_key:".concat(String.valueOf(this.a.getString(17)));
                        default:
                            return "color_palette_index:".concat(String.valueOf(this.a.getString(18)));
                    }
                }
            });
            if (db(9)) {
                if (z) {
                    String[] dm7 = dm(getString(cI(9, ParticipantsTable.a)));
                    strArr6 = strArr5;
                    for (int i19 = 0; i19 < dm7.length; i19++) {
                        dm7[i19] = yta.a(dm7[i19]);
                    }
                    strArr7 = (String[]) agnc.z(null, dm7, new String[0]);
                } else {
                    strArr6 = strArr5;
                    strArr7 = new String[]{F()};
                }
            } else {
                strArr6 = strArr5;
                strArr7 = null;
            }
            final int i20 = 14;
            agmp.ds(length, strArr7, new alhr(this) { // from class: tau
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i20) {
                        case 0:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(39)));
                        case 1:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(38)));
                        case 2:
                            return "sub_id:".concat(String.valueOf(this.a.getString(3)));
                        case 3:
                            return "last_modified_by_key:".concat(String.valueOf(this.a.getString(40)));
                        case 4:
                            return "name_source:".concat(String.valueOf(this.a.getString(41)));
                        case 5:
                            return "photo_source:".concat(String.valueOf(this.a.getString(42)));
                        case 6:
                            return "profile_photo_user_preference:".concat(String.valueOf(this.a.getString(43)));
                        case 7:
                            return "contact_metadata:".concat(String.valueOf(this.a.getString(44)));
                        case 8:
                            return "sim_slot_id:".concat(String.valueOf(this.a.getString(4)));
                        case 9:
                            return "full_name:".concat(String.valueOf(this.a.getString(12)));
                        case 10:
                            return "normalized_destination:".concat(String.valueOf(this.a.getString(5)));
                        case 11:
                            return "send_destination:".concat(String.valueOf(this.a.getString(6)));
                        case 12:
                            return "display_destination:".concat(String.valueOf(this.a.getString(7)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(8)));
                        case 14:
                            return "country_code:".concat(String.valueOf(this.a.getString(9)));
                        case 15:
                            return "first_name:".concat(String.valueOf(this.a.getString(13)));
                        case 16:
                            return "profile_photo_uri:".concat(String.valueOf(this.a.getString(14)));
                        case 17:
                            return "contact_photo_uri:".concat(String.valueOf(this.a.getString(15)));
                        case 18:
                            return "contact_id:".concat(String.valueOf(this.a.getString(16)));
                        case 19:
                            return "lookup_key:".concat(String.valueOf(this.a.getString(17)));
                        default:
                            return "color_palette_index:".concat(String.valueOf(this.a.getString(18)));
                    }
                }
            });
            if (db(10)) {
                if (z) {
                    jArr = agnc.y(null, dl(getString(cI(10, ParticipantsTable.a))));
                } else {
                    jArr = new long[]{o()};
                }
            } else {
                jArr = null;
            }
            String[] strArr26 = strArr7;
            final int i21 = 8;
            agmp.dr(length, jArr, new alhr(this) { // from class: tat
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i21) {
                        case 0:
                            return "blocked:".concat(String.valueOf(this.a.getString(21)));
                        case 1:
                            return "extended_color:".concat(String.valueOf(this.a.getString(20)));
                        case 2:
                            return "subscription_name:".concat(String.valueOf(this.a.getString(22)));
                        case 3:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(23)));
                        case 4:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(24)));
                        case 5:
                            return "participant_type:".concat(String.valueOf(this.a.getString(25)));
                        case 6:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(26)));
                        case 7:
                            return "alias:".concat(String.valueOf(this.a.getString(27)));
                        case 8:
                            return "recipient_id:".concat(String.valueOf(this.a.getString(10)));
                        case 9:
                            return "is_spam:".concat(String.valueOf(this.a.getString(28)));
                        case 10:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(29)));
                        case 11:
                            return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(2)));
                        case 12:
                            return "cms_id:".concat(String.valueOf(this.a.getString(30)));
                        case 13:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(31)));
                        case 14:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(32)));
                        case 15:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(33)));
                        case 16:
                            return "directory_id:".concat(String.valueOf(this.a.getString(34)));
                        case 17:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(35)));
                        case 18:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(36)));
                        case 19:
                            return "recipient_canonical_address:".concat(String.valueOf(this.a.getString(11)));
                        default:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(37)));
                    }
                }
            });
            if (db(11)) {
                if (z) {
                    jArr2 = jArr;
                    strArr8 = (String[]) agnc.z(null, dm(getString(cI(11, ParticipantsTable.a))), new String[0]);
                } else {
                    jArr2 = jArr;
                    strArr8 = new String[]{O()};
                }
            } else {
                jArr2 = jArr;
                strArr8 = null;
            }
            final int i22 = 19;
            agmp.ds(length, strArr8, new alhr(this) { // from class: tat
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i22) {
                        case 0:
                            return "blocked:".concat(String.valueOf(this.a.getString(21)));
                        case 1:
                            return "extended_color:".concat(String.valueOf(this.a.getString(20)));
                        case 2:
                            return "subscription_name:".concat(String.valueOf(this.a.getString(22)));
                        case 3:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(23)));
                        case 4:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(24)));
                        case 5:
                            return "participant_type:".concat(String.valueOf(this.a.getString(25)));
                        case 6:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(26)));
                        case 7:
                            return "alias:".concat(String.valueOf(this.a.getString(27)));
                        case 8:
                            return "recipient_id:".concat(String.valueOf(this.a.getString(10)));
                        case 9:
                            return "is_spam:".concat(String.valueOf(this.a.getString(28)));
                        case 10:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(29)));
                        case 11:
                            return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(2)));
                        case 12:
                            return "cms_id:".concat(String.valueOf(this.a.getString(30)));
                        case 13:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(31)));
                        case 14:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(32)));
                        case 15:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(33)));
                        case 16:
                            return "directory_id:".concat(String.valueOf(this.a.getString(34)));
                        case 17:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(35)));
                        case 18:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(36)));
                        case 19:
                            return "recipient_canonical_address:".concat(String.valueOf(this.a.getString(11)));
                        default:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(37)));
                    }
                }
            });
            if (db(12)) {
                if (z) {
                    String[] dm8 = dm(getString(cI(12, ParticipantsTable.a)));
                    strArr9 = strArr8;
                    for (int i23 = 0; i23 < dm8.length; i23++) {
                        dm8[i23] = yta.a(dm8[i23]);
                    }
                    strArr10 = (String[]) agnc.z(null, dm8, new String[0]);
                } else {
                    strArr9 = strArr8;
                    strArr10 = new String[]{J()};
                }
            } else {
                strArr9 = strArr8;
                strArr10 = null;
            }
            final int i24 = 9;
            agmp.ds(length, strArr10, new alhr(this) { // from class: tau
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i24) {
                        case 0:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(39)));
                        case 1:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(38)));
                        case 2:
                            return "sub_id:".concat(String.valueOf(this.a.getString(3)));
                        case 3:
                            return "last_modified_by_key:".concat(String.valueOf(this.a.getString(40)));
                        case 4:
                            return "name_source:".concat(String.valueOf(this.a.getString(41)));
                        case 5:
                            return "photo_source:".concat(String.valueOf(this.a.getString(42)));
                        case 6:
                            return "profile_photo_user_preference:".concat(String.valueOf(this.a.getString(43)));
                        case 7:
                            return "contact_metadata:".concat(String.valueOf(this.a.getString(44)));
                        case 8:
                            return "sim_slot_id:".concat(String.valueOf(this.a.getString(4)));
                        case 9:
                            return "full_name:".concat(String.valueOf(this.a.getString(12)));
                        case 10:
                            return "normalized_destination:".concat(String.valueOf(this.a.getString(5)));
                        case 11:
                            return "send_destination:".concat(String.valueOf(this.a.getString(6)));
                        case 12:
                            return "display_destination:".concat(String.valueOf(this.a.getString(7)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(8)));
                        case 14:
                            return "country_code:".concat(String.valueOf(this.a.getString(9)));
                        case 15:
                            return "first_name:".concat(String.valueOf(this.a.getString(13)));
                        case 16:
                            return "profile_photo_uri:".concat(String.valueOf(this.a.getString(14)));
                        case 17:
                            return "contact_photo_uri:".concat(String.valueOf(this.a.getString(15)));
                        case 18:
                            return "contact_id:".concat(String.valueOf(this.a.getString(16)));
                        case 19:
                            return "lookup_key:".concat(String.valueOf(this.a.getString(17)));
                        default:
                            return "color_palette_index:".concat(String.valueOf(this.a.getString(18)));
                    }
                }
            });
            if (db(13)) {
                if (z) {
                    String[] dm9 = dm(getString(cI(13, ParticipantsTable.a)));
                    strArr11 = strArr10;
                    for (int i25 = 0; i25 < dm9.length; i25++) {
                        dm9[i25] = yta.a(dm9[i25]);
                    }
                    strArr12 = (String[]) agnc.z(null, dm9, new String[0]);
                } else {
                    strArr11 = strArr10;
                    strArr12 = new String[]{I()};
                }
            } else {
                strArr11 = strArr10;
                strArr12 = null;
            }
            final int i26 = 15;
            agmp.ds(length, strArr12, new alhr(this) { // from class: tau
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i26) {
                        case 0:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(39)));
                        case 1:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(38)));
                        case 2:
                            return "sub_id:".concat(String.valueOf(this.a.getString(3)));
                        case 3:
                            return "last_modified_by_key:".concat(String.valueOf(this.a.getString(40)));
                        case 4:
                            return "name_source:".concat(String.valueOf(this.a.getString(41)));
                        case 5:
                            return "photo_source:".concat(String.valueOf(this.a.getString(42)));
                        case 6:
                            return "profile_photo_user_preference:".concat(String.valueOf(this.a.getString(43)));
                        case 7:
                            return "contact_metadata:".concat(String.valueOf(this.a.getString(44)));
                        case 8:
                            return "sim_slot_id:".concat(String.valueOf(this.a.getString(4)));
                        case 9:
                            return "full_name:".concat(String.valueOf(this.a.getString(12)));
                        case 10:
                            return "normalized_destination:".concat(String.valueOf(this.a.getString(5)));
                        case 11:
                            return "send_destination:".concat(String.valueOf(this.a.getString(6)));
                        case 12:
                            return "display_destination:".concat(String.valueOf(this.a.getString(7)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(8)));
                        case 14:
                            return "country_code:".concat(String.valueOf(this.a.getString(9)));
                        case 15:
                            return "first_name:".concat(String.valueOf(this.a.getString(13)));
                        case 16:
                            return "profile_photo_uri:".concat(String.valueOf(this.a.getString(14)));
                        case 17:
                            return "contact_photo_uri:".concat(String.valueOf(this.a.getString(15)));
                        case 18:
                            return "contact_id:".concat(String.valueOf(this.a.getString(16)));
                        case 19:
                            return "lookup_key:".concat(String.valueOf(this.a.getString(17)));
                        default:
                            return "color_palette_index:".concat(String.valueOf(this.a.getString(18)));
                    }
                }
            });
            if (db(14)) {
                if (z) {
                    String[] dm10 = dm(getString(cI(14, ParticipantsTable.a)));
                    int length4 = dm10.length;
                    strArr13 = strArr12;
                    Uri[] uriArr5 = new Uri[length4];
                    strArr14 = strArr4;
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < length4) {
                        String str = dm10[i27];
                        int i29 = i28 + 1;
                        if (str != null && str.length() != 0) {
                            uri2 = Uri.parse(str);
                        } else {
                            uri2 = null;
                        }
                        uriArr5[i28] = uri2;
                        i27++;
                        i28 = i29;
                    }
                    uriArr = (Uri[]) agnc.z(null, uriArr5, new Uri[0]);
                } else {
                    strArr13 = strArr12;
                    strArr14 = strArr4;
                    uriArr = new Uri[]{q()};
                }
            } else {
                strArr13 = strArr12;
                strArr14 = strArr4;
                uriArr = null;
            }
            final int i30 = 16;
            agmp.ds(length, uriArr, new alhr(this) { // from class: tau
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i30) {
                        case 0:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(39)));
                        case 1:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(38)));
                        case 2:
                            return "sub_id:".concat(String.valueOf(this.a.getString(3)));
                        case 3:
                            return "last_modified_by_key:".concat(String.valueOf(this.a.getString(40)));
                        case 4:
                            return "name_source:".concat(String.valueOf(this.a.getString(41)));
                        case 5:
                            return "photo_source:".concat(String.valueOf(this.a.getString(42)));
                        case 6:
                            return "profile_photo_user_preference:".concat(String.valueOf(this.a.getString(43)));
                        case 7:
                            return "contact_metadata:".concat(String.valueOf(this.a.getString(44)));
                        case 8:
                            return "sim_slot_id:".concat(String.valueOf(this.a.getString(4)));
                        case 9:
                            return "full_name:".concat(String.valueOf(this.a.getString(12)));
                        case 10:
                            return "normalized_destination:".concat(String.valueOf(this.a.getString(5)));
                        case 11:
                            return "send_destination:".concat(String.valueOf(this.a.getString(6)));
                        case 12:
                            return "display_destination:".concat(String.valueOf(this.a.getString(7)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(8)));
                        case 14:
                            return "country_code:".concat(String.valueOf(this.a.getString(9)));
                        case 15:
                            return "first_name:".concat(String.valueOf(this.a.getString(13)));
                        case 16:
                            return "profile_photo_uri:".concat(String.valueOf(this.a.getString(14)));
                        case 17:
                            return "contact_photo_uri:".concat(String.valueOf(this.a.getString(15)));
                        case 18:
                            return "contact_id:".concat(String.valueOf(this.a.getString(16)));
                        case 19:
                            return "lookup_key:".concat(String.valueOf(this.a.getString(17)));
                        default:
                            return "color_palette_index:".concat(String.valueOf(this.a.getString(18)));
                    }
                }
            });
            if (db(15)) {
                if (z) {
                    String[] dm11 = dm(getString(cI(15, ParticipantsTable.a)));
                    int length5 = dm11.length;
                    Uri[] uriArr6 = new Uri[length5];
                    uriArr2 = uriArr;
                    int i31 = 0;
                    int i32 = 0;
                    while (i31 < length5) {
                        String str2 = dm11[i31];
                        int i33 = i32 + 1;
                        if (str2 != null && str2.length() != 0) {
                            uri = Uri.parse(str2);
                        } else {
                            uri = null;
                        }
                        uriArr6[i32] = uri;
                        i31++;
                        i32 = i33;
                    }
                    uriArr3 = (Uri[]) agnc.z(null, uriArr6, new Uri[0]);
                } else {
                    uriArr2 = uriArr;
                    uriArr3 = new Uri[]{p()};
                }
            } else {
                uriArr2 = uriArr;
                uriArr3 = null;
            }
            final int i34 = 17;
            agmp.ds(length, uriArr3, new alhr(this) { // from class: tau
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i34) {
                        case 0:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(39)));
                        case 1:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(38)));
                        case 2:
                            return "sub_id:".concat(String.valueOf(this.a.getString(3)));
                        case 3:
                            return "last_modified_by_key:".concat(String.valueOf(this.a.getString(40)));
                        case 4:
                            return "name_source:".concat(String.valueOf(this.a.getString(41)));
                        case 5:
                            return "photo_source:".concat(String.valueOf(this.a.getString(42)));
                        case 6:
                            return "profile_photo_user_preference:".concat(String.valueOf(this.a.getString(43)));
                        case 7:
                            return "contact_metadata:".concat(String.valueOf(this.a.getString(44)));
                        case 8:
                            return "sim_slot_id:".concat(String.valueOf(this.a.getString(4)));
                        case 9:
                            return "full_name:".concat(String.valueOf(this.a.getString(12)));
                        case 10:
                            return "normalized_destination:".concat(String.valueOf(this.a.getString(5)));
                        case 11:
                            return "send_destination:".concat(String.valueOf(this.a.getString(6)));
                        case 12:
                            return "display_destination:".concat(String.valueOf(this.a.getString(7)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(8)));
                        case 14:
                            return "country_code:".concat(String.valueOf(this.a.getString(9)));
                        case 15:
                            return "first_name:".concat(String.valueOf(this.a.getString(13)));
                        case 16:
                            return "profile_photo_uri:".concat(String.valueOf(this.a.getString(14)));
                        case 17:
                            return "contact_photo_uri:".concat(String.valueOf(this.a.getString(15)));
                        case 18:
                            return "contact_id:".concat(String.valueOf(this.a.getString(16)));
                        case 19:
                            return "lookup_key:".concat(String.valueOf(this.a.getString(17)));
                        default:
                            return "color_palette_index:".concat(String.valueOf(this.a.getString(18)));
                    }
                }
            });
            if (db(16)) {
                if (z) {
                    jArr3 = agnc.y(null, dl(getString(cI(16, ParticipantsTable.a))));
                } else {
                    jArr3 = new long[]{m()};
                }
            } else {
                jArr3 = null;
            }
            final int i35 = 18;
            agmp.dr(length, jArr3, new alhr(this) { // from class: tau
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i35) {
                        case 0:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(39)));
                        case 1:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(38)));
                        case 2:
                            return "sub_id:".concat(String.valueOf(this.a.getString(3)));
                        case 3:
                            return "last_modified_by_key:".concat(String.valueOf(this.a.getString(40)));
                        case 4:
                            return "name_source:".concat(String.valueOf(this.a.getString(41)));
                        case 5:
                            return "photo_source:".concat(String.valueOf(this.a.getString(42)));
                        case 6:
                            return "profile_photo_user_preference:".concat(String.valueOf(this.a.getString(43)));
                        case 7:
                            return "contact_metadata:".concat(String.valueOf(this.a.getString(44)));
                        case 8:
                            return "sim_slot_id:".concat(String.valueOf(this.a.getString(4)));
                        case 9:
                            return "full_name:".concat(String.valueOf(this.a.getString(12)));
                        case 10:
                            return "normalized_destination:".concat(String.valueOf(this.a.getString(5)));
                        case 11:
                            return "send_destination:".concat(String.valueOf(this.a.getString(6)));
                        case 12:
                            return "display_destination:".concat(String.valueOf(this.a.getString(7)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(8)));
                        case 14:
                            return "country_code:".concat(String.valueOf(this.a.getString(9)));
                        case 15:
                            return "first_name:".concat(String.valueOf(this.a.getString(13)));
                        case 16:
                            return "profile_photo_uri:".concat(String.valueOf(this.a.getString(14)));
                        case 17:
                            return "contact_photo_uri:".concat(String.valueOf(this.a.getString(15)));
                        case 18:
                            return "contact_id:".concat(String.valueOf(this.a.getString(16)));
                        case 19:
                            return "lookup_key:".concat(String.valueOf(this.a.getString(17)));
                        default:
                            return "color_palette_index:".concat(String.valueOf(this.a.getString(18)));
                    }
                }
            });
            if (db(17)) {
                if (z) {
                    jArr4 = jArr3;
                    strArr15 = (String[]) agnc.z(null, dm(getString(cI(17, ParticipantsTable.a))), new String[0]);
                } else {
                    jArr4 = jArr3;
                    strArr15 = new String[]{L()};
                }
            } else {
                jArr4 = jArr3;
                strArr15 = null;
            }
            final int i36 = 19;
            agmp.ds(length, strArr15, new alhr(this) { // from class: tau
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i36) {
                        case 0:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(39)));
                        case 1:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(38)));
                        case 2:
                            return "sub_id:".concat(String.valueOf(this.a.getString(3)));
                        case 3:
                            return "last_modified_by_key:".concat(String.valueOf(this.a.getString(40)));
                        case 4:
                            return "name_source:".concat(String.valueOf(this.a.getString(41)));
                        case 5:
                            return "photo_source:".concat(String.valueOf(this.a.getString(42)));
                        case 6:
                            return "profile_photo_user_preference:".concat(String.valueOf(this.a.getString(43)));
                        case 7:
                            return "contact_metadata:".concat(String.valueOf(this.a.getString(44)));
                        case 8:
                            return "sim_slot_id:".concat(String.valueOf(this.a.getString(4)));
                        case 9:
                            return "full_name:".concat(String.valueOf(this.a.getString(12)));
                        case 10:
                            return "normalized_destination:".concat(String.valueOf(this.a.getString(5)));
                        case 11:
                            return "send_destination:".concat(String.valueOf(this.a.getString(6)));
                        case 12:
                            return "display_destination:".concat(String.valueOf(this.a.getString(7)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(8)));
                        case 14:
                            return "country_code:".concat(String.valueOf(this.a.getString(9)));
                        case 15:
                            return "first_name:".concat(String.valueOf(this.a.getString(13)));
                        case 16:
                            return "profile_photo_uri:".concat(String.valueOf(this.a.getString(14)));
                        case 17:
                            return "contact_photo_uri:".concat(String.valueOf(this.a.getString(15)));
                        case 18:
                            return "contact_id:".concat(String.valueOf(this.a.getString(16)));
                        case 19:
                            return "lookup_key:".concat(String.valueOf(this.a.getString(17)));
                        default:
                            return "color_palette_index:".concat(String.valueOf(this.a.getString(18)));
                    }
                }
            });
            if (db(18)) {
                if (z) {
                    iArr3 = agnc.w(null, dk(getString(cI(18, ParticipantsTable.a))));
                } else {
                    iArr3 = new int[]{c()};
                }
            } else {
                iArr3 = null;
            }
            String[] strArr27 = strArr15;
            final int i37 = 20;
            agmp.dq(length, iArr3, new alhr(this) { // from class: tau
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i37) {
                        case 0:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(39)));
                        case 1:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(38)));
                        case 2:
                            return "sub_id:".concat(String.valueOf(this.a.getString(3)));
                        case 3:
                            return "last_modified_by_key:".concat(String.valueOf(this.a.getString(40)));
                        case 4:
                            return "name_source:".concat(String.valueOf(this.a.getString(41)));
                        case 5:
                            return "photo_source:".concat(String.valueOf(this.a.getString(42)));
                        case 6:
                            return "profile_photo_user_preference:".concat(String.valueOf(this.a.getString(43)));
                        case 7:
                            return "contact_metadata:".concat(String.valueOf(this.a.getString(44)));
                        case 8:
                            return "sim_slot_id:".concat(String.valueOf(this.a.getString(4)));
                        case 9:
                            return "full_name:".concat(String.valueOf(this.a.getString(12)));
                        case 10:
                            return "normalized_destination:".concat(String.valueOf(this.a.getString(5)));
                        case 11:
                            return "send_destination:".concat(String.valueOf(this.a.getString(6)));
                        case 12:
                            return "display_destination:".concat(String.valueOf(this.a.getString(7)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(8)));
                        case 14:
                            return "country_code:".concat(String.valueOf(this.a.getString(9)));
                        case 15:
                            return "first_name:".concat(String.valueOf(this.a.getString(13)));
                        case 16:
                            return "profile_photo_uri:".concat(String.valueOf(this.a.getString(14)));
                        case 17:
                            return "contact_photo_uri:".concat(String.valueOf(this.a.getString(15)));
                        case 18:
                            return "contact_id:".concat(String.valueOf(this.a.getString(16)));
                        case 19:
                            return "lookup_key:".concat(String.valueOf(this.a.getString(17)));
                        default:
                            return "color_palette_index:".concat(String.valueOf(this.a.getString(18)));
                    }
                }
            });
            if (db(19)) {
                if (z) {
                    iArr4 = agnc.w(null, dk(getString(cI(19, ParticipantsTable.a))));
                } else {
                    iArr4 = new int[]{e()};
                }
            } else {
                iArr4 = null;
            }
            int[] iArr15 = iArr3;
            agmp.dq(length, iArr4, new tai(this, 19));
            if (db(20)) {
                if (z) {
                    iArr6 = agnc.w(null, dk(getString(cI(20, ParticipantsTable.a))));
                    iArr5 = iArr4;
                    i = 1;
                } else {
                    i = 1;
                    iArr6 = new int[]{f()};
                    iArr5 = iArr4;
                }
            } else {
                i = 1;
                iArr5 = iArr4;
                iArr6 = null;
            }
            agmp.dq(length, iArr6, new alhr(this) { // from class: tat
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i) {
                        case 0:
                            return "blocked:".concat(String.valueOf(this.a.getString(21)));
                        case 1:
                            return "extended_color:".concat(String.valueOf(this.a.getString(20)));
                        case 2:
                            return "subscription_name:".concat(String.valueOf(this.a.getString(22)));
                        case 3:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(23)));
                        case 4:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(24)));
                        case 5:
                            return "participant_type:".concat(String.valueOf(this.a.getString(25)));
                        case 6:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(26)));
                        case 7:
                            return "alias:".concat(String.valueOf(this.a.getString(27)));
                        case 8:
                            return "recipient_id:".concat(String.valueOf(this.a.getString(10)));
                        case 9:
                            return "is_spam:".concat(String.valueOf(this.a.getString(28)));
                        case 10:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(29)));
                        case 11:
                            return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(2)));
                        case 12:
                            return "cms_id:".concat(String.valueOf(this.a.getString(30)));
                        case 13:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(31)));
                        case 14:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(32)));
                        case 15:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(33)));
                        case 16:
                            return "directory_id:".concat(String.valueOf(this.a.getString(34)));
                        case 17:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(35)));
                        case 18:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(36)));
                        case 19:
                            return "recipient_canonical_address:".concat(String.valueOf(this.a.getString(11)));
                        default:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(37)));
                    }
                }
            });
            if (db(21)) {
                if (z) {
                    zArr = agnc.A(null, dn(getString(cI(21, ParticipantsTable.a))));
                    iArr7 = iArr6;
                    i2 = 0;
                } else {
                    iArr7 = iArr6;
                    i2 = 0;
                    zArr = new boolean[]{R()};
                }
            } else {
                iArr7 = iArr6;
                i2 = 0;
                zArr = null;
            }
            agmp.dt(length, zArr, new alhr(this) { // from class: tat
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i2) {
                        case 0:
                            return "blocked:".concat(String.valueOf(this.a.getString(21)));
                        case 1:
                            return "extended_color:".concat(String.valueOf(this.a.getString(20)));
                        case 2:
                            return "subscription_name:".concat(String.valueOf(this.a.getString(22)));
                        case 3:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(23)));
                        case 4:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(24)));
                        case 5:
                            return "participant_type:".concat(String.valueOf(this.a.getString(25)));
                        case 6:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(26)));
                        case 7:
                            return "alias:".concat(String.valueOf(this.a.getString(27)));
                        case 8:
                            return "recipient_id:".concat(String.valueOf(this.a.getString(10)));
                        case 9:
                            return "is_spam:".concat(String.valueOf(this.a.getString(28)));
                        case 10:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(29)));
                        case 11:
                            return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(2)));
                        case 12:
                            return "cms_id:".concat(String.valueOf(this.a.getString(30)));
                        case 13:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(31)));
                        case 14:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(32)));
                        case 15:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(33)));
                        case 16:
                            return "directory_id:".concat(String.valueOf(this.a.getString(34)));
                        case 17:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(35)));
                        case 18:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(36)));
                        case 19:
                            return "recipient_canonical_address:".concat(String.valueOf(this.a.getString(11)));
                        default:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(37)));
                    }
                }
            });
            if (db(22)) {
                if (z) {
                    zArr2 = zArr;
                    strArr16 = (String[]) agnc.z(null, dm(getString(cI(22, ParticipantsTable.a))), new String[0]);
                } else {
                    zArr2 = zArr;
                    strArr16 = new String[]{Q()};
                }
            } else {
                zArr2 = zArr;
                strArr16 = null;
            }
            final int i38 = 2;
            agmp.ds(length, strArr16, new alhr(this) { // from class: tat
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i38) {
                        case 0:
                            return "blocked:".concat(String.valueOf(this.a.getString(21)));
                        case 1:
                            return "extended_color:".concat(String.valueOf(this.a.getString(20)));
                        case 2:
                            return "subscription_name:".concat(String.valueOf(this.a.getString(22)));
                        case 3:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(23)));
                        case 4:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(24)));
                        case 5:
                            return "participant_type:".concat(String.valueOf(this.a.getString(25)));
                        case 6:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(26)));
                        case 7:
                            return "alias:".concat(String.valueOf(this.a.getString(27)));
                        case 8:
                            return "recipient_id:".concat(String.valueOf(this.a.getString(10)));
                        case 9:
                            return "is_spam:".concat(String.valueOf(this.a.getString(28)));
                        case 10:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(29)));
                        case 11:
                            return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(2)));
                        case 12:
                            return "cms_id:".concat(String.valueOf(this.a.getString(30)));
                        case 13:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(31)));
                        case 14:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(32)));
                        case 15:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(33)));
                        case 16:
                            return "directory_id:".concat(String.valueOf(this.a.getString(34)));
                        case 17:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(35)));
                        case 18:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(36)));
                        case 19:
                            return "recipient_canonical_address:".concat(String.valueOf(this.a.getString(11)));
                        default:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(37)));
                    }
                }
            });
            if (db(23)) {
                if (z) {
                    iArr8 = agnc.w(null, dk(getString(cI(23, ParticipantsTable.a))));
                } else {
                    iArr8 = new int[]{k()};
                }
            } else {
                iArr8 = null;
            }
            String[] strArr28 = strArr16;
            final int i39 = 3;
            agmp.dq(length, iArr8, new alhr(this) { // from class: tat
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i39) {
                        case 0:
                            return "blocked:".concat(String.valueOf(this.a.getString(21)));
                        case 1:
                            return "extended_color:".concat(String.valueOf(this.a.getString(20)));
                        case 2:
                            return "subscription_name:".concat(String.valueOf(this.a.getString(22)));
                        case 3:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(23)));
                        case 4:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(24)));
                        case 5:
                            return "participant_type:".concat(String.valueOf(this.a.getString(25)));
                        case 6:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(26)));
                        case 7:
                            return "alias:".concat(String.valueOf(this.a.getString(27)));
                        case 8:
                            return "recipient_id:".concat(String.valueOf(this.a.getString(10)));
                        case 9:
                            return "is_spam:".concat(String.valueOf(this.a.getString(28)));
                        case 10:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(29)));
                        case 11:
                            return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(2)));
                        case 12:
                            return "cms_id:".concat(String.valueOf(this.a.getString(30)));
                        case 13:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(31)));
                        case 14:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(32)));
                        case 15:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(33)));
                        case 16:
                            return "directory_id:".concat(String.valueOf(this.a.getString(34)));
                        case 17:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(35)));
                        case 18:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(36)));
                        case 19:
                            return "recipient_canonical_address:".concat(String.valueOf(this.a.getString(11)));
                        default:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(37)));
                    }
                }
            });
            if (db(24)) {
                if (z) {
                    iArr9 = iArr8;
                    strArr17 = (String[]) agnc.z(null, dm(getString(cI(24, ParticipantsTable.a))), new String[0]);
                } else {
                    iArr9 = iArr8;
                    strArr17 = new String[]{E()};
                }
            } else {
                iArr9 = iArr8;
                strArr17 = null;
            }
            final int i40 = 4;
            agmp.ds(length, strArr17, new alhr(this) { // from class: tat
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i40) {
                        case 0:
                            return "blocked:".concat(String.valueOf(this.a.getString(21)));
                        case 1:
                            return "extended_color:".concat(String.valueOf(this.a.getString(20)));
                        case 2:
                            return "subscription_name:".concat(String.valueOf(this.a.getString(22)));
                        case 3:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(23)));
                        case 4:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(24)));
                        case 5:
                            return "participant_type:".concat(String.valueOf(this.a.getString(25)));
                        case 6:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(26)));
                        case 7:
                            return "alias:".concat(String.valueOf(this.a.getString(27)));
                        case 8:
                            return "recipient_id:".concat(String.valueOf(this.a.getString(10)));
                        case 9:
                            return "is_spam:".concat(String.valueOf(this.a.getString(28)));
                        case 10:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(29)));
                        case 11:
                            return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(2)));
                        case 12:
                            return "cms_id:".concat(String.valueOf(this.a.getString(30)));
                        case 13:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(31)));
                        case 14:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(32)));
                        case 15:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(33)));
                        case 16:
                            return "directory_id:".concat(String.valueOf(this.a.getString(34)));
                        case 17:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(35)));
                        case 18:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(36)));
                        case 19:
                            return "recipient_canonical_address:".concat(String.valueOf(this.a.getString(11)));
                        default:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(37)));
                    }
                }
            });
            if (db(25)) {
                if (z) {
                    iArr10 = agnc.w(null, dk(getString(cI(25, ParticipantsTable.a))));
                } else {
                    iArr10 = new int[]{h()};
                }
            } else {
                iArr10 = null;
            }
            String[] strArr29 = strArr17;
            final int i41 = 5;
            agmp.dq(length, iArr10, new alhr(this) { // from class: tat
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i41) {
                        case 0:
                            return "blocked:".concat(String.valueOf(this.a.getString(21)));
                        case 1:
                            return "extended_color:".concat(String.valueOf(this.a.getString(20)));
                        case 2:
                            return "subscription_name:".concat(String.valueOf(this.a.getString(22)));
                        case 3:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(23)));
                        case 4:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(24)));
                        case 5:
                            return "participant_type:".concat(String.valueOf(this.a.getString(25)));
                        case 6:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(26)));
                        case 7:
                            return "alias:".concat(String.valueOf(this.a.getString(27)));
                        case 8:
                            return "recipient_id:".concat(String.valueOf(this.a.getString(10)));
                        case 9:
                            return "is_spam:".concat(String.valueOf(this.a.getString(28)));
                        case 10:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(29)));
                        case 11:
                            return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(2)));
                        case 12:
                            return "cms_id:".concat(String.valueOf(this.a.getString(30)));
                        case 13:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(31)));
                        case 14:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(32)));
                        case 15:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(33)));
                        case 16:
                            return "directory_id:".concat(String.valueOf(this.a.getString(34)));
                        case 17:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(35)));
                        case 18:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(36)));
                        case 19:
                            return "recipient_canonical_address:".concat(String.valueOf(this.a.getString(11)));
                        default:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(37)));
                    }
                }
            });
            if (db(26)) {
                if (z) {
                    iArr11 = agnc.w(null, dk(getString(cI(26, ParticipantsTable.a))));
                } else {
                    iArr11 = new int[]{l()};
                }
            } else {
                iArr11 = null;
            }
            int[] iArr16 = iArr10;
            final int i42 = 6;
            agmp.dq(length, iArr11, new alhr(this) { // from class: tat
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i42) {
                        case 0:
                            return "blocked:".concat(String.valueOf(this.a.getString(21)));
                        case 1:
                            return "extended_color:".concat(String.valueOf(this.a.getString(20)));
                        case 2:
                            return "subscription_name:".concat(String.valueOf(this.a.getString(22)));
                        case 3:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(23)));
                        case 4:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(24)));
                        case 5:
                            return "participant_type:".concat(String.valueOf(this.a.getString(25)));
                        case 6:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(26)));
                        case 7:
                            return "alias:".concat(String.valueOf(this.a.getString(27)));
                        case 8:
                            return "recipient_id:".concat(String.valueOf(this.a.getString(10)));
                        case 9:
                            return "is_spam:".concat(String.valueOf(this.a.getString(28)));
                        case 10:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(29)));
                        case 11:
                            return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(2)));
                        case 12:
                            return "cms_id:".concat(String.valueOf(this.a.getString(30)));
                        case 13:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(31)));
                        case 14:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(32)));
                        case 15:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(33)));
                        case 16:
                            return "directory_id:".concat(String.valueOf(this.a.getString(34)));
                        case 17:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(35)));
                        case 18:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(36)));
                        case 19:
                            return "recipient_canonical_address:".concat(String.valueOf(this.a.getString(11)));
                        default:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(37)));
                    }
                }
            });
            if (db(27)) {
                if (z) {
                    iArr12 = iArr11;
                    strArr18 = (String[]) agnc.z(null, dm(getString(cI(27, ParticipantsTable.a))), new String[0]);
                } else {
                    iArr12 = iArr11;
                    strArr18 = new String[]{B()};
                }
            } else {
                iArr12 = iArr11;
                strArr18 = null;
            }
            final int i43 = 7;
            agmp.ds(length, strArr18, new alhr(this) { // from class: tat
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i43) {
                        case 0:
                            return "blocked:".concat(String.valueOf(this.a.getString(21)));
                        case 1:
                            return "extended_color:".concat(String.valueOf(this.a.getString(20)));
                        case 2:
                            return "subscription_name:".concat(String.valueOf(this.a.getString(22)));
                        case 3:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(23)));
                        case 4:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(24)));
                        case 5:
                            return "participant_type:".concat(String.valueOf(this.a.getString(25)));
                        case 6:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(26)));
                        case 7:
                            return "alias:".concat(String.valueOf(this.a.getString(27)));
                        case 8:
                            return "recipient_id:".concat(String.valueOf(this.a.getString(10)));
                        case 9:
                            return "is_spam:".concat(String.valueOf(this.a.getString(28)));
                        case 10:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(29)));
                        case 11:
                            return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(2)));
                        case 12:
                            return "cms_id:".concat(String.valueOf(this.a.getString(30)));
                        case 13:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(31)));
                        case 14:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(32)));
                        case 15:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(33)));
                        case 16:
                            return "directory_id:".concat(String.valueOf(this.a.getString(34)));
                        case 17:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(35)));
                        case 18:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(36)));
                        case 19:
                            return "recipient_canonical_address:".concat(String.valueOf(this.a.getString(11)));
                        default:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(37)));
                    }
                }
            });
            if (db(28)) {
                if (z) {
                    zArr3 = agnc.A(null, dn(getString(cI(28, ParticipantsTable.a))));
                } else {
                    zArr3 = new boolean[]{T()};
                }
            } else {
                zArr3 = null;
            }
            String[] strArr30 = strArr18;
            final int i44 = 9;
            agmp.dt(length, zArr3, new alhr(this) { // from class: tat
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i44) {
                        case 0:
                            return "blocked:".concat(String.valueOf(this.a.getString(21)));
                        case 1:
                            return "extended_color:".concat(String.valueOf(this.a.getString(20)));
                        case 2:
                            return "subscription_name:".concat(String.valueOf(this.a.getString(22)));
                        case 3:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(23)));
                        case 4:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(24)));
                        case 5:
                            return "participant_type:".concat(String.valueOf(this.a.getString(25)));
                        case 6:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(26)));
                        case 7:
                            return "alias:".concat(String.valueOf(this.a.getString(27)));
                        case 8:
                            return "recipient_id:".concat(String.valueOf(this.a.getString(10)));
                        case 9:
                            return "is_spam:".concat(String.valueOf(this.a.getString(28)));
                        case 10:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(29)));
                        case 11:
                            return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(2)));
                        case 12:
                            return "cms_id:".concat(String.valueOf(this.a.getString(30)));
                        case 13:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(31)));
                        case 14:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(32)));
                        case 15:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(33)));
                        case 16:
                            return "directory_id:".concat(String.valueOf(this.a.getString(34)));
                        case 17:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(35)));
                        case 18:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(36)));
                        case 19:
                            return "recipient_canonical_address:".concat(String.valueOf(this.a.getString(11)));
                        default:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(37)));
                    }
                }
            });
            if (db(29)) {
                if (z) {
                    iArr13 = agnc.w(null, dk(getString(cI(29, ParticipantsTable.a))));
                } else {
                    iArr13 = new int[]{g()};
                }
            } else {
                iArr13 = null;
            }
            boolean[] zArr7 = zArr3;
            final int i45 = 10;
            agmp.dq(length, iArr13, new alhr(this) { // from class: tat
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i45) {
                        case 0:
                            return "blocked:".concat(String.valueOf(this.a.getString(21)));
                        case 1:
                            return "extended_color:".concat(String.valueOf(this.a.getString(20)));
                        case 2:
                            return "subscription_name:".concat(String.valueOf(this.a.getString(22)));
                        case 3:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(23)));
                        case 4:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(24)));
                        case 5:
                            return "participant_type:".concat(String.valueOf(this.a.getString(25)));
                        case 6:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(26)));
                        case 7:
                            return "alias:".concat(String.valueOf(this.a.getString(27)));
                        case 8:
                            return "recipient_id:".concat(String.valueOf(this.a.getString(10)));
                        case 9:
                            return "is_spam:".concat(String.valueOf(this.a.getString(28)));
                        case 10:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(29)));
                        case 11:
                            return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(2)));
                        case 12:
                            return "cms_id:".concat(String.valueOf(this.a.getString(30)));
                        case 13:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(31)));
                        case 14:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(32)));
                        case 15:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(33)));
                        case 16:
                            return "directory_id:".concat(String.valueOf(this.a.getString(34)));
                        case 17:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(35)));
                        case 18:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(36)));
                        case 19:
                            return "recipient_canonical_address:".concat(String.valueOf(this.a.getString(11)));
                        default:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(37)));
                    }
                }
            });
            if (db(30)) {
                if (z) {
                    iArr14 = iArr13;
                    strArr19 = (String[]) agnc.z(null, dm(getString(cI(30, ParticipantsTable.a))), new String[0]);
                } else {
                    iArr14 = iArr13;
                    strArr19 = new String[]{C()};
                }
            } else {
                iArr14 = iArr13;
                strArr19 = null;
            }
            final int i46 = 12;
            agmp.ds(length, strArr19, new alhr(this) { // from class: tat
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i46) {
                        case 0:
                            return "blocked:".concat(String.valueOf(this.a.getString(21)));
                        case 1:
                            return "extended_color:".concat(String.valueOf(this.a.getString(20)));
                        case 2:
                            return "subscription_name:".concat(String.valueOf(this.a.getString(22)));
                        case 3:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(23)));
                        case 4:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(24)));
                        case 5:
                            return "participant_type:".concat(String.valueOf(this.a.getString(25)));
                        case 6:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(26)));
                        case 7:
                            return "alias:".concat(String.valueOf(this.a.getString(27)));
                        case 8:
                            return "recipient_id:".concat(String.valueOf(this.a.getString(10)));
                        case 9:
                            return "is_spam:".concat(String.valueOf(this.a.getString(28)));
                        case 10:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(29)));
                        case 11:
                            return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(2)));
                        case 12:
                            return "cms_id:".concat(String.valueOf(this.a.getString(30)));
                        case 13:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(31)));
                        case 14:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(32)));
                        case 15:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(33)));
                        case 16:
                            return "directory_id:".concat(String.valueOf(this.a.getString(34)));
                        case 17:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(35)));
                        case 18:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(36)));
                        case 19:
                            return "recipient_canonical_address:".concat(String.valueOf(this.a.getString(11)));
                        default:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(37)));
                    }
                }
            });
            if (db(31)) {
                if (z) {
                    int[] dk = dk(getString(cI(31, ParticipantsTable.a)));
                    tqr[] values = tqr.values();
                    strArr21 = strArr19;
                    int length6 = values.length;
                    uriArr4 = uriArr3;
                    tqr[] tqrVarArr2 = new tqr[dk.length];
                    strArr20 = strArr3;
                    strArr22 = strArr2;
                    for (int i47 = 0; i47 < dk.length; i47++) {
                        int i48 = dk[i47];
                        if (i48 < length6) {
                            tqrVarArr2[i47] = values[i48];
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    tqrVarArr = (tqr[]) agnc.z(null, tqrVarArr2, new tqr[0]);
                } else {
                    strArr20 = strArr3;
                    strArr21 = strArr19;
                    strArr22 = strArr2;
                    uriArr4 = uriArr3;
                    tqrVarArr = new tqr[]{w()};
                }
            } else {
                strArr20 = strArr3;
                strArr21 = strArr19;
                strArr22 = strArr2;
                uriArr4 = uriArr3;
                tqrVarArr = null;
            }
            final int i49 = 13;
            agmp.ds(length, tqrVarArr, new alhr(this) { // from class: tat
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i49) {
                        case 0:
                            return "blocked:".concat(String.valueOf(this.a.getString(21)));
                        case 1:
                            return "extended_color:".concat(String.valueOf(this.a.getString(20)));
                        case 2:
                            return "subscription_name:".concat(String.valueOf(this.a.getString(22)));
                        case 3:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(23)));
                        case 4:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(24)));
                        case 5:
                            return "participant_type:".concat(String.valueOf(this.a.getString(25)));
                        case 6:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(26)));
                        case 7:
                            return "alias:".concat(String.valueOf(this.a.getString(27)));
                        case 8:
                            return "recipient_id:".concat(String.valueOf(this.a.getString(10)));
                        case 9:
                            return "is_spam:".concat(String.valueOf(this.a.getString(28)));
                        case 10:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(29)));
                        case 11:
                            return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(2)));
                        case 12:
                            return "cms_id:".concat(String.valueOf(this.a.getString(30)));
                        case 13:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(31)));
                        case 14:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(32)));
                        case 15:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(33)));
                        case 16:
                            return "directory_id:".concat(String.valueOf(this.a.getString(34)));
                        case 17:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(35)));
                        case 18:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(36)));
                        case 19:
                            return "recipient_canonical_address:".concat(String.valueOf(this.a.getString(11)));
                        default:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(37)));
                    }
                }
            });
            if (db(32)) {
                if (z) {
                    strArr23 = (String[]) agnc.z(null, dm(getString(cI(32, ParticipantsTable.a))), new String[0]);
                } else {
                    strArr23 = new String[]{N()};
                }
            } else {
                strArr23 = null;
            }
            final int i50 = 14;
            agmp.ds(length, strArr23, new alhr(this) { // from class: tat
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i50) {
                        case 0:
                            return "blocked:".concat(String.valueOf(this.a.getString(21)));
                        case 1:
                            return "extended_color:".concat(String.valueOf(this.a.getString(20)));
                        case 2:
                            return "subscription_name:".concat(String.valueOf(this.a.getString(22)));
                        case 3:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(23)));
                        case 4:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(24)));
                        case 5:
                            return "participant_type:".concat(String.valueOf(this.a.getString(25)));
                        case 6:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(26)));
                        case 7:
                            return "alias:".concat(String.valueOf(this.a.getString(27)));
                        case 8:
                            return "recipient_id:".concat(String.valueOf(this.a.getString(10)));
                        case 9:
                            return "is_spam:".concat(String.valueOf(this.a.getString(28)));
                        case 10:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(29)));
                        case 11:
                            return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(2)));
                        case 12:
                            return "cms_id:".concat(String.valueOf(this.a.getString(30)));
                        case 13:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(31)));
                        case 14:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(32)));
                        case 15:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(33)));
                        case 16:
                            return "directory_id:".concat(String.valueOf(this.a.getString(34)));
                        case 17:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(35)));
                        case 18:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(36)));
                        case 19:
                            return "recipient_canonical_address:".concat(String.valueOf(this.a.getString(11)));
                        default:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(37)));
                    }
                }
            });
            if (db(33)) {
                if (z) {
                    bArr = agnc.B(null, dv(getString(cI(33, ParticipantsTable.a))));
                } else {
                    bArr = new byte[][]{V()};
                }
            } else {
                bArr = null;
            }
            final int i51 = 15;
            agmp.ds(length, bArr, new alhr(this) { // from class: tat
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i51) {
                        case 0:
                            return "blocked:".concat(String.valueOf(this.a.getString(21)));
                        case 1:
                            return "extended_color:".concat(String.valueOf(this.a.getString(20)));
                        case 2:
                            return "subscription_name:".concat(String.valueOf(this.a.getString(22)));
                        case 3:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(23)));
                        case 4:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(24)));
                        case 5:
                            return "participant_type:".concat(String.valueOf(this.a.getString(25)));
                        case 6:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(26)));
                        case 7:
                            return "alias:".concat(String.valueOf(this.a.getString(27)));
                        case 8:
                            return "recipient_id:".concat(String.valueOf(this.a.getString(10)));
                        case 9:
                            return "is_spam:".concat(String.valueOf(this.a.getString(28)));
                        case 10:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(29)));
                        case 11:
                            return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(2)));
                        case 12:
                            return "cms_id:".concat(String.valueOf(this.a.getString(30)));
                        case 13:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(31)));
                        case 14:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(32)));
                        case 15:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(33)));
                        case 16:
                            return "directory_id:".concat(String.valueOf(this.a.getString(34)));
                        case 17:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(35)));
                        case 18:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(36)));
                        case 19:
                            return "recipient_canonical_address:".concat(String.valueOf(this.a.getString(11)));
                        default:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(37)));
                    }
                }
            });
            if (db(34)) {
                if (z) {
                    jArr5 = agnc.y(null, dl(getString(cI(34, ParticipantsTable.a))));
                } else {
                    jArr5 = new long[]{n()};
                }
            } else {
                jArr5 = null;
            }
            final int i52 = 16;
            agmp.dr(length, jArr5, new alhr(this) { // from class: tat
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i52) {
                        case 0:
                            return "blocked:".concat(String.valueOf(this.a.getString(21)));
                        case 1:
                            return "extended_color:".concat(String.valueOf(this.a.getString(20)));
                        case 2:
                            return "subscription_name:".concat(String.valueOf(this.a.getString(22)));
                        case 3:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(23)));
                        case 4:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(24)));
                        case 5:
                            return "participant_type:".concat(String.valueOf(this.a.getString(25)));
                        case 6:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(26)));
                        case 7:
                            return "alias:".concat(String.valueOf(this.a.getString(27)));
                        case 8:
                            return "recipient_id:".concat(String.valueOf(this.a.getString(10)));
                        case 9:
                            return "is_spam:".concat(String.valueOf(this.a.getString(28)));
                        case 10:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(29)));
                        case 11:
                            return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(2)));
                        case 12:
                            return "cms_id:".concat(String.valueOf(this.a.getString(30)));
                        case 13:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(31)));
                        case 14:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(32)));
                        case 15:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(33)));
                        case 16:
                            return "directory_id:".concat(String.valueOf(this.a.getString(34)));
                        case 17:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(35)));
                        case 18:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(36)));
                        case 19:
                            return "recipient_canonical_address:".concat(String.valueOf(this.a.getString(11)));
                        default:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(37)));
                    }
                }
            });
            if (db(35)) {
                if (z) {
                    zArr4 = agnc.A(null, dn(getString(cI(35, ParticipantsTable.a))));
                } else {
                    zArr4 = new boolean[]{S()};
                }
            } else {
                zArr4 = null;
            }
            long[] jArr7 = jArr5;
            final int i53 = 17;
            agmp.dt(length, zArr4, new alhr(this) { // from class: tat
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i53) {
                        case 0:
                            return "blocked:".concat(String.valueOf(this.a.getString(21)));
                        case 1:
                            return "extended_color:".concat(String.valueOf(this.a.getString(20)));
                        case 2:
                            return "subscription_name:".concat(String.valueOf(this.a.getString(22)));
                        case 3:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(23)));
                        case 4:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(24)));
                        case 5:
                            return "participant_type:".concat(String.valueOf(this.a.getString(25)));
                        case 6:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(26)));
                        case 7:
                            return "alias:".concat(String.valueOf(this.a.getString(27)));
                        case 8:
                            return "recipient_id:".concat(String.valueOf(this.a.getString(10)));
                        case 9:
                            return "is_spam:".concat(String.valueOf(this.a.getString(28)));
                        case 10:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(29)));
                        case 11:
                            return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(2)));
                        case 12:
                            return "cms_id:".concat(String.valueOf(this.a.getString(30)));
                        case 13:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(31)));
                        case 14:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(32)));
                        case 15:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(33)));
                        case 16:
                            return "directory_id:".concat(String.valueOf(this.a.getString(34)));
                        case 17:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(35)));
                        case 18:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(36)));
                        case 19:
                            return "recipient_canonical_address:".concat(String.valueOf(this.a.getString(11)));
                        default:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(37)));
                    }
                }
            });
            if (db(36)) {
                if (z) {
                    zArr5 = agnc.A(null, dn(getString(cI(36, ParticipantsTable.a))));
                } else {
                    zArr5 = new boolean[]{U()};
                }
            } else {
                zArr5 = null;
            }
            boolean[] zArr8 = zArr4;
            final int i54 = 18;
            agmp.dt(length, zArr5, new alhr(this) { // from class: tat
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i54) {
                        case 0:
                            return "blocked:".concat(String.valueOf(this.a.getString(21)));
                        case 1:
                            return "extended_color:".concat(String.valueOf(this.a.getString(20)));
                        case 2:
                            return "subscription_name:".concat(String.valueOf(this.a.getString(22)));
                        case 3:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(23)));
                        case 4:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(24)));
                        case 5:
                            return "participant_type:".concat(String.valueOf(this.a.getString(25)));
                        case 6:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(26)));
                        case 7:
                            return "alias:".concat(String.valueOf(this.a.getString(27)));
                        case 8:
                            return "recipient_id:".concat(String.valueOf(this.a.getString(10)));
                        case 9:
                            return "is_spam:".concat(String.valueOf(this.a.getString(28)));
                        case 10:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(29)));
                        case 11:
                            return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(2)));
                        case 12:
                            return "cms_id:".concat(String.valueOf(this.a.getString(30)));
                        case 13:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(31)));
                        case 14:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(32)));
                        case 15:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(33)));
                        case 16:
                            return "directory_id:".concat(String.valueOf(this.a.getString(34)));
                        case 17:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(35)));
                        case 18:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(36)));
                        case 19:
                            return "recipient_canonical_address:".concat(String.valueOf(this.a.getString(11)));
                        default:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(37)));
                    }
                }
            });
            if (db(37)) {
                if (z) {
                    zArr6 = zArr5;
                    strArr24 = (String[]) agnc.z(null, dm(getString(cI(37, ParticipantsTable.a))), new String[0]);
                } else {
                    zArr6 = zArr5;
                    strArr24 = new String[]{H()};
                }
            } else {
                zArr6 = zArr5;
                strArr24 = null;
            }
            final int i55 = 20;
            agmp.ds(length, strArr24, new alhr(this) { // from class: tat
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i55) {
                        case 0:
                            return "blocked:".concat(String.valueOf(this.a.getString(21)));
                        case 1:
                            return "extended_color:".concat(String.valueOf(this.a.getString(20)));
                        case 2:
                            return "subscription_name:".concat(String.valueOf(this.a.getString(22)));
                        case 3:
                            return "subscription_color:".concat(String.valueOf(this.a.getString(23)));
                        case 4:
                            return "contact_destination:".concat(String.valueOf(this.a.getString(24)));
                        case 5:
                            return "participant_type:".concat(String.valueOf(this.a.getString(25)));
                        case 6:
                            return "video_reachability:".concat(String.valueOf(this.a.getString(26)));
                        case 7:
                            return "alias:".concat(String.valueOf(this.a.getString(27)));
                        case 8:
                            return "recipient_id:".concat(String.valueOf(this.a.getString(10)));
                        case 9:
                            return "is_spam:".concat(String.valueOf(this.a.getString(28)));
                        case 10:
                            return "is_spam_source:".concat(String.valueOf(this.a.getString(29)));
                        case 11:
                            return "my_identity_token_foreign_key:".concat(String.valueOf(this.a.getString(2)));
                        case 12:
                            return "cms_id:".concat(String.valueOf(this.a.getString(30)));
                        case 13:
                            return "latest_verification_status:".concat(String.valueOf(this.a.getString(31)));
                        case 14:
                            return "profile_photo_blob_id:".concat(String.valueOf(this.a.getString(32)));
                        case 15:
                            return "profile_photo_encryption_key:".concat(String.valueOf(this.a.getString(33)));
                        case 16:
                            return "directory_id:".concat(String.valueOf(this.a.getString(34)));
                        case 17:
                            return "is_check_constraint_enabled_via_phenotype:".concat(String.valueOf(this.a.getString(35)));
                        case 18:
                            return "is_valid_phone_number_data:".concat(String.valueOf(this.a.getString(36)));
                        case 19:
                            return "recipient_canonical_address:".concat(String.valueOf(this.a.getString(11)));
                        default:
                            return "duplicate_of:".concat(String.valueOf(this.a.getString(37)));
                    }
                }
            });
            if (db(38)) {
                if (z) {
                    strArr25 = strArr24;
                    xxwVarArr = W();
                    i3 = 1;
                } else {
                    i3 = 1;
                    xxwVarArr = new xxw[]{A()};
                    strArr25 = strArr24;
                }
            } else {
                i3 = 1;
                strArr25 = strArr24;
                xxwVarArr = null;
            }
            agmp.ds(length, xxwVarArr, new alhr(this) { // from class: tau
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i3) {
                        case 0:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(39)));
                        case 1:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(38)));
                        case 2:
                            return "sub_id:".concat(String.valueOf(this.a.getString(3)));
                        case 3:
                            return "last_modified_by_key:".concat(String.valueOf(this.a.getString(40)));
                        case 4:
                            return "name_source:".concat(String.valueOf(this.a.getString(41)));
                        case 5:
                            return "photo_source:".concat(String.valueOf(this.a.getString(42)));
                        case 6:
                            return "profile_photo_user_preference:".concat(String.valueOf(this.a.getString(43)));
                        case 7:
                            return "contact_metadata:".concat(String.valueOf(this.a.getString(44)));
                        case 8:
                            return "sim_slot_id:".concat(String.valueOf(this.a.getString(4)));
                        case 9:
                            return "full_name:".concat(String.valueOf(this.a.getString(12)));
                        case 10:
                            return "normalized_destination:".concat(String.valueOf(this.a.getString(5)));
                        case 11:
                            return "send_destination:".concat(String.valueOf(this.a.getString(6)));
                        case 12:
                            return "display_destination:".concat(String.valueOf(this.a.getString(7)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(8)));
                        case 14:
                            return "country_code:".concat(String.valueOf(this.a.getString(9)));
                        case 15:
                            return "first_name:".concat(String.valueOf(this.a.getString(13)));
                        case 16:
                            return "profile_photo_uri:".concat(String.valueOf(this.a.getString(14)));
                        case 17:
                            return "contact_photo_uri:".concat(String.valueOf(this.a.getString(15)));
                        case 18:
                            return "contact_id:".concat(String.valueOf(this.a.getString(16)));
                        case 19:
                            return "lookup_key:".concat(String.valueOf(this.a.getString(17)));
                        default:
                            return "color_palette_index:".concat(String.valueOf(this.a.getString(18)));
                    }
                }
            });
            if (db(39)) {
                if (z) {
                    int[] dk2 = dk(getString(cI(39, ParticipantsTable.a)));
                    mta[] mtaVarArr3 = new mta[dk2.length];
                    bArr2 = bArr;
                    xxwVarArr2 = xxwVarArr;
                    for (int i56 = 0; i56 < dk2.length; i56++) {
                        mta b = mta.b(dk2[i56]);
                        if (b != null) {
                            mtaVarArr3[i56] = b;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    i4 = 0;
                    mtaVarArr = (mta[]) agnc.z(null, mtaVarArr3, new mta[0]);
                } else {
                    bArr2 = bArr;
                    xxwVarArr2 = xxwVarArr;
                    i4 = 0;
                    mtaVarArr = new mta[]{r()};
                }
            } else {
                bArr2 = bArr;
                xxwVarArr2 = xxwVarArr;
                i4 = 0;
                mtaVarArr = null;
            }
            agmp.ds(length, mtaVarArr, new alhr(this) { // from class: tau
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i4) {
                        case 0:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(39)));
                        case 1:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(38)));
                        case 2:
                            return "sub_id:".concat(String.valueOf(this.a.getString(3)));
                        case 3:
                            return "last_modified_by_key:".concat(String.valueOf(this.a.getString(40)));
                        case 4:
                            return "name_source:".concat(String.valueOf(this.a.getString(41)));
                        case 5:
                            return "photo_source:".concat(String.valueOf(this.a.getString(42)));
                        case 6:
                            return "profile_photo_user_preference:".concat(String.valueOf(this.a.getString(43)));
                        case 7:
                            return "contact_metadata:".concat(String.valueOf(this.a.getString(44)));
                        case 8:
                            return "sim_slot_id:".concat(String.valueOf(this.a.getString(4)));
                        case 9:
                            return "full_name:".concat(String.valueOf(this.a.getString(12)));
                        case 10:
                            return "normalized_destination:".concat(String.valueOf(this.a.getString(5)));
                        case 11:
                            return "send_destination:".concat(String.valueOf(this.a.getString(6)));
                        case 12:
                            return "display_destination:".concat(String.valueOf(this.a.getString(7)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(8)));
                        case 14:
                            return "country_code:".concat(String.valueOf(this.a.getString(9)));
                        case 15:
                            return "first_name:".concat(String.valueOf(this.a.getString(13)));
                        case 16:
                            return "profile_photo_uri:".concat(String.valueOf(this.a.getString(14)));
                        case 17:
                            return "contact_photo_uri:".concat(String.valueOf(this.a.getString(15)));
                        case 18:
                            return "contact_id:".concat(String.valueOf(this.a.getString(16)));
                        case 19:
                            return "lookup_key:".concat(String.valueOf(this.a.getString(17)));
                        default:
                            return "color_palette_index:".concat(String.valueOf(this.a.getString(18)));
                    }
                }
            });
            if (db(40)) {
                if (z) {
                    String[] dm12 = dm(getString(cI(40, ParticipantsTable.a)));
                    int length7 = dm12.length;
                    rxg[] rxgVarArr3 = new rxg[length7];
                    mtaVarArr2 = mtaVarArr;
                    for (int i57 = 0; i57 < length7; i57++) {
                        rxgVarArr3[i57] = vcp.l(dm12[i57]);
                    }
                    rxgVarArr = (rxg[]) agnc.z(null, rxgVarArr3, new rxg[0]);
                } else {
                    mtaVarArr2 = mtaVarArr;
                    rxgVarArr = new rxg[]{v()};
                }
            } else {
                mtaVarArr2 = mtaVarArr;
                rxgVarArr = null;
            }
            final int i58 = 3;
            agmp.ds(length, rxgVarArr, new alhr(this) { // from class: tau
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i58) {
                        case 0:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(39)));
                        case 1:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(38)));
                        case 2:
                            return "sub_id:".concat(String.valueOf(this.a.getString(3)));
                        case 3:
                            return "last_modified_by_key:".concat(String.valueOf(this.a.getString(40)));
                        case 4:
                            return "name_source:".concat(String.valueOf(this.a.getString(41)));
                        case 5:
                            return "photo_source:".concat(String.valueOf(this.a.getString(42)));
                        case 6:
                            return "profile_photo_user_preference:".concat(String.valueOf(this.a.getString(43)));
                        case 7:
                            return "contact_metadata:".concat(String.valueOf(this.a.getString(44)));
                        case 8:
                            return "sim_slot_id:".concat(String.valueOf(this.a.getString(4)));
                        case 9:
                            return "full_name:".concat(String.valueOf(this.a.getString(12)));
                        case 10:
                            return "normalized_destination:".concat(String.valueOf(this.a.getString(5)));
                        case 11:
                            return "send_destination:".concat(String.valueOf(this.a.getString(6)));
                        case 12:
                            return "display_destination:".concat(String.valueOf(this.a.getString(7)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(8)));
                        case 14:
                            return "country_code:".concat(String.valueOf(this.a.getString(9)));
                        case 15:
                            return "first_name:".concat(String.valueOf(this.a.getString(13)));
                        case 16:
                            return "profile_photo_uri:".concat(String.valueOf(this.a.getString(14)));
                        case 17:
                            return "contact_photo_uri:".concat(String.valueOf(this.a.getString(15)));
                        case 18:
                            return "contact_id:".concat(String.valueOf(this.a.getString(16)));
                        case 19:
                            return "lookup_key:".concat(String.valueOf(this.a.getString(17)));
                        default:
                            return "color_palette_index:".concat(String.valueOf(this.a.getString(18)));
                    }
                }
            });
            if (db(41)) {
                if (z) {
                    int[] dk3 = dk(getString(cI(41, ParticipantsTable.a)));
                    vox[] voxVarArr5 = new vox[dk3.length];
                    rxgVarArr2 = rxgVarArr;
                    for (int i59 = 0; i59 < dk3.length; i59++) {
                        vox b2 = vox.b(dk3[i59]);
                        if (b2 != null) {
                            voxVarArr5[i59] = b2;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    voxVarArr = (vox[]) agnc.z(null, voxVarArr5, new vox[0]);
                } else {
                    rxgVarArr2 = rxgVarArr;
                    voxVarArr = new vox[]{y()};
                }
            } else {
                rxgVarArr2 = rxgVarArr;
                voxVarArr = null;
            }
            final int i60 = 4;
            agmp.ds(length, voxVarArr, new alhr(this) { // from class: tau
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i60) {
                        case 0:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(39)));
                        case 1:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(38)));
                        case 2:
                            return "sub_id:".concat(String.valueOf(this.a.getString(3)));
                        case 3:
                            return "last_modified_by_key:".concat(String.valueOf(this.a.getString(40)));
                        case 4:
                            return "name_source:".concat(String.valueOf(this.a.getString(41)));
                        case 5:
                            return "photo_source:".concat(String.valueOf(this.a.getString(42)));
                        case 6:
                            return "profile_photo_user_preference:".concat(String.valueOf(this.a.getString(43)));
                        case 7:
                            return "contact_metadata:".concat(String.valueOf(this.a.getString(44)));
                        case 8:
                            return "sim_slot_id:".concat(String.valueOf(this.a.getString(4)));
                        case 9:
                            return "full_name:".concat(String.valueOf(this.a.getString(12)));
                        case 10:
                            return "normalized_destination:".concat(String.valueOf(this.a.getString(5)));
                        case 11:
                            return "send_destination:".concat(String.valueOf(this.a.getString(6)));
                        case 12:
                            return "display_destination:".concat(String.valueOf(this.a.getString(7)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(8)));
                        case 14:
                            return "country_code:".concat(String.valueOf(this.a.getString(9)));
                        case 15:
                            return "first_name:".concat(String.valueOf(this.a.getString(13)));
                        case 16:
                            return "profile_photo_uri:".concat(String.valueOf(this.a.getString(14)));
                        case 17:
                            return "contact_photo_uri:".concat(String.valueOf(this.a.getString(15)));
                        case 18:
                            return "contact_id:".concat(String.valueOf(this.a.getString(16)));
                        case 19:
                            return "lookup_key:".concat(String.valueOf(this.a.getString(17)));
                        default:
                            return "color_palette_index:".concat(String.valueOf(this.a.getString(18)));
                    }
                }
            });
            if (db(42)) {
                if (z) {
                    int[] dk4 = dk(getString(cI(42, ParticipantsTable.a)));
                    vox[] voxVarArr6 = new vox[dk4.length];
                    voxVarArr2 = voxVarArr;
                    for (int i61 = 0; i61 < dk4.length; i61++) {
                        vox b3 = vox.b(dk4[i61]);
                        if (b3 != null) {
                            voxVarArr6[i61] = b3;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    voxVarArr3 = (vox[]) agnc.z(null, voxVarArr6, new vox[0]);
                } else {
                    voxVarArr2 = voxVarArr;
                    voxVarArr3 = new vox[]{z()};
                }
            } else {
                voxVarArr2 = voxVarArr;
                voxVarArr3 = null;
            }
            final int i62 = 5;
            agmp.ds(length, voxVarArr3, new alhr(this) { // from class: tau
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i62) {
                        case 0:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(39)));
                        case 1:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(38)));
                        case 2:
                            return "sub_id:".concat(String.valueOf(this.a.getString(3)));
                        case 3:
                            return "last_modified_by_key:".concat(String.valueOf(this.a.getString(40)));
                        case 4:
                            return "name_source:".concat(String.valueOf(this.a.getString(41)));
                        case 5:
                            return "photo_source:".concat(String.valueOf(this.a.getString(42)));
                        case 6:
                            return "profile_photo_user_preference:".concat(String.valueOf(this.a.getString(43)));
                        case 7:
                            return "contact_metadata:".concat(String.valueOf(this.a.getString(44)));
                        case 8:
                            return "sim_slot_id:".concat(String.valueOf(this.a.getString(4)));
                        case 9:
                            return "full_name:".concat(String.valueOf(this.a.getString(12)));
                        case 10:
                            return "normalized_destination:".concat(String.valueOf(this.a.getString(5)));
                        case 11:
                            return "send_destination:".concat(String.valueOf(this.a.getString(6)));
                        case 12:
                            return "display_destination:".concat(String.valueOf(this.a.getString(7)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(8)));
                        case 14:
                            return "country_code:".concat(String.valueOf(this.a.getString(9)));
                        case 15:
                            return "first_name:".concat(String.valueOf(this.a.getString(13)));
                        case 16:
                            return "profile_photo_uri:".concat(String.valueOf(this.a.getString(14)));
                        case 17:
                            return "contact_photo_uri:".concat(String.valueOf(this.a.getString(15)));
                        case 18:
                            return "contact_id:".concat(String.valueOf(this.a.getString(16)));
                        case 19:
                            return "lookup_key:".concat(String.valueOf(this.a.getString(17)));
                        default:
                            return "color_palette_index:".concat(String.valueOf(this.a.getString(18)));
                    }
                }
            });
            if (db(43)) {
                if (z) {
                    int[] dk5 = dk(getString(cI(43, ParticipantsTable.a)));
                    vov[] vovVarArr2 = new vov[dk5.length];
                    voxVarArr4 = voxVarArr3;
                    for (int i63 = 0; i63 < dk5.length; i63++) {
                        vov b4 = vov.b(dk5[i63]);
                        if (b4 != null) {
                            vovVarArr2[i63] = b4;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    vovVarArr = (vov[]) agnc.z(null, vovVarArr2, new vov[0]);
                } else {
                    voxVarArr4 = voxVarArr3;
                    vovVarArr = new vov[]{x()};
                }
            } else {
                voxVarArr4 = voxVarArr3;
                vovVarArr = null;
            }
            final int i64 = 6;
            agmp.ds(length, vovVarArr, new alhr(this) { // from class: tau
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i64) {
                        case 0:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(39)));
                        case 1:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(38)));
                        case 2:
                            return "sub_id:".concat(String.valueOf(this.a.getString(3)));
                        case 3:
                            return "last_modified_by_key:".concat(String.valueOf(this.a.getString(40)));
                        case 4:
                            return "name_source:".concat(String.valueOf(this.a.getString(41)));
                        case 5:
                            return "photo_source:".concat(String.valueOf(this.a.getString(42)));
                        case 6:
                            return "profile_photo_user_preference:".concat(String.valueOf(this.a.getString(43)));
                        case 7:
                            return "contact_metadata:".concat(String.valueOf(this.a.getString(44)));
                        case 8:
                            return "sim_slot_id:".concat(String.valueOf(this.a.getString(4)));
                        case 9:
                            return "full_name:".concat(String.valueOf(this.a.getString(12)));
                        case 10:
                            return "normalized_destination:".concat(String.valueOf(this.a.getString(5)));
                        case 11:
                            return "send_destination:".concat(String.valueOf(this.a.getString(6)));
                        case 12:
                            return "display_destination:".concat(String.valueOf(this.a.getString(7)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(8)));
                        case 14:
                            return "country_code:".concat(String.valueOf(this.a.getString(9)));
                        case 15:
                            return "first_name:".concat(String.valueOf(this.a.getString(13)));
                        case 16:
                            return "profile_photo_uri:".concat(String.valueOf(this.a.getString(14)));
                        case 17:
                            return "contact_photo_uri:".concat(String.valueOf(this.a.getString(15)));
                        case 18:
                            return "contact_id:".concat(String.valueOf(this.a.getString(16)));
                        case 19:
                            return "lookup_key:".concat(String.valueOf(this.a.getString(17)));
                        default:
                            return "color_palette_index:".concat(String.valueOf(this.a.getString(18)));
                    }
                }
            });
            if (db(44)) {
                if (z) {
                    List cY = cY(getString(cI(44, ParticipantsTable.a)));
                    ndp[] ndpVarArr2 = new ndp[cY.size()];
                    Iterator it2 = cY.iterator();
                    int i65 = 0;
                    while (it2.hasNext()) {
                        try {
                            byte[] v = agnc.v((String) it2.next());
                            int i66 = i65 + 1;
                            if (v == null) {
                                it = it2;
                                ndpVar = null;
                            } else {
                                it = it2;
                                try {
                                    ndpVar = (ndp) apag.parseFrom(ndp.a, v);
                                } catch (Throwable unused) {
                                    i65 = i66;
                                    ndpVarArr2[i65] = null;
                                    i65++;
                                    it2 = it;
                                }
                            }
                            ndpVarArr2[i65] = ndpVar;
                            it2 = it;
                            i65 = i66;
                        } catch (Throwable unused2) {
                            it = it2;
                        }
                    }
                    i5 = 0;
                    ndpVarArr = (ndp[]) agnc.z(null, ndpVarArr2, new ndp[0]);
                } else {
                    i5 = 0;
                    ndpVarArr = new ndp[]{s()};
                }
            } else {
                i5 = 0;
                ndpVarArr = null;
            }
            final int i67 = 7;
            agmp.ds(length, ndpVarArr, new alhr(this) { // from class: tau
                public final /* synthetic */ tav a;

                {
                    this.a = this;
                }

                @Override // defpackage.alhr
                public final Object get() {
                    switch (i67) {
                        case 0:
                            return "norm_ui_status:".concat(String.valueOf(this.a.getString(39)));
                        case 1:
                            return "cms_life_cycle:".concat(String.valueOf(this.a.getString(38)));
                        case 2:
                            return "sub_id:".concat(String.valueOf(this.a.getString(3)));
                        case 3:
                            return "last_modified_by_key:".concat(String.valueOf(this.a.getString(40)));
                        case 4:
                            return "name_source:".concat(String.valueOf(this.a.getString(41)));
                        case 5:
                            return "photo_source:".concat(String.valueOf(this.a.getString(42)));
                        case 6:
                            return "profile_photo_user_preference:".concat(String.valueOf(this.a.getString(43)));
                        case 7:
                            return "contact_metadata:".concat(String.valueOf(this.a.getString(44)));
                        case 8:
                            return "sim_slot_id:".concat(String.valueOf(this.a.getString(4)));
                        case 9:
                            return "full_name:".concat(String.valueOf(this.a.getString(12)));
                        case 10:
                            return "normalized_destination:".concat(String.valueOf(this.a.getString(5)));
                        case 11:
                            return "send_destination:".concat(String.valueOf(this.a.getString(6)));
                        case 12:
                            return "display_destination:".concat(String.valueOf(this.a.getString(7)));
                        case 13:
                            return "comparable_destination:".concat(String.valueOf(this.a.getString(8)));
                        case 14:
                            return "country_code:".concat(String.valueOf(this.a.getString(9)));
                        case 15:
                            return "first_name:".concat(String.valueOf(this.a.getString(13)));
                        case 16:
                            return "profile_photo_uri:".concat(String.valueOf(this.a.getString(14)));
                        case 17:
                            return "contact_photo_uri:".concat(String.valueOf(this.a.getString(15)));
                        case 18:
                            return "contact_id:".concat(String.valueOf(this.a.getString(16)));
                        case 19:
                            return "lookup_key:".concat(String.valueOf(this.a.getString(17)));
                        default:
                            return "color_palette_index:".concat(String.valueOf(this.a.getString(18)));
                    }
                }
            });
            alob alobVar = new alob();
            while (i5 < length) {
                try {
                    long j = du[i5];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i5]));
                        tap d = ParticipantsTable.d();
                        d.aB();
                        long j2 = du[i5];
                        if (strArr != null) {
                            d.v(strArr[i5]);
                        }
                        if (qweVarArr != null) {
                            d.D(qweVarArr[i5]);
                        }
                        if (qweVarArr2 != null) {
                            d.E(qweVarArr2[i5]);
                        }
                        if (iArr != null) {
                            d.S(iArr[i5]);
                        }
                        if (iArr2 != null) {
                            d.R(iArr2[i5]);
                        }
                        if (strArr22 != null) {
                            d.H(strArr22[i5]);
                        }
                        if (strArr20 != null) {
                            d.Q(strArr20[i5]);
                        }
                        if (strArr14 != null) {
                            d.q(strArr14[i5]);
                        }
                        if (strArr6 != null) {
                            d.j(strArr6[i5]);
                        }
                        if (strArr26 != null) {
                            d.o(strArr26[i5]);
                        }
                        if (jArr2 != null) {
                            jArr6 = du;
                            d.P(jArr2[i5]);
                        } else {
                            jArr6 = du;
                        }
                        if (strArr9 != null) {
                            d.O(strArr9[i5]);
                        }
                        if (strArr11 != null) {
                            d.u(strArr11[i5]);
                        }
                        if (strArr13 != null) {
                            d.t(strArr13[i5]);
                        }
                        if (uriArr2 != null) {
                            d.M(uriArr2[i5]);
                        }
                        if (uriArr4 != null) {
                            d.n(uriArr4[i5]);
                        }
                        if (jArr4 != null) {
                            d.l(jArr4[i5]);
                        }
                        if (strArr27 != null) {
                            d.C(strArr27[i5]);
                        }
                        if (iArr15 != null) {
                            d.h(iArr15[i5]);
                        }
                        if (iArr5 != null) {
                            d.i(iArr5[i5]);
                        }
                        if (iArr7 != null) {
                            d.s(iArr7[i5]);
                        }
                        if (zArr2 != null) {
                            d.e(zArr2[i5]);
                        }
                        if (strArr28 != null) {
                            d.U(strArr28[i5]);
                        }
                        if (iArr9 != null) {
                            d.T(iArr9[i5]);
                        }
                        if (strArr29 != null) {
                            d.k(strArr29[i5]);
                        }
                        if (iArr16 != null) {
                            d.I(iArr16[i5]);
                        }
                        if (iArr12 != null) {
                            d.V(iArr12[i5]);
                        }
                        if (strArr30 != null) {
                            d.d(strArr30[i5]);
                        }
                        if (zArr7 != null) {
                            d.x(zArr7[i5]);
                        }
                        if (iArr14 != null) {
                            d.y(iArr14[i5]);
                        }
                        if (strArr21 != null) {
                            d.f(strArr21[i5]);
                        }
                        if (tqrVarArr != null) {
                            d.B(tqrVarArr[i5]);
                        }
                        if (strArr23 != null) {
                            d.K(strArr23[i5]);
                        }
                        if (bArr2 != null) {
                            d.L(bArr2[i5]);
                        }
                        if (jArr7 != null) {
                            d.p(jArr7[i5]);
                        }
                        if (zArr8 != null) {
                            d.w(zArr8[i5]);
                        }
                        if (zArr6 != null) {
                            d.z(zArr6[i5]);
                        }
                        if (strArr25 != null) {
                            d.r(strArr25[i5]);
                        }
                        if (xxwVarArr2 != null) {
                            d.g(xxwVarArr2[i5]);
                        }
                        if (mtaVarArr2 != null) {
                            d.G(mtaVarArr2[i5]);
                        }
                        if (rxgVarArr2 != null) {
                            d.A(rxgVarArr2[i5]);
                        }
                        if (voxVarArr2 != null) {
                            d.F(voxVarArr2[i5]);
                        }
                        if (voxVarArr4 != null) {
                            d.J(voxVarArr4[i5]);
                        }
                        if (vovVarArr != null) {
                            d.N(vovVarArr[i5]);
                        }
                        if (ndpVarArr != null) {
                            d.m(ndpVarArr[i5]);
                        }
                        alobVar.h(d.a());
                        i5++;
                        du = jArr6;
                    }
                    jArr6 = du;
                    i5++;
                    du = jArr6;
                } catch (aglw unused3) {
                }
            }
            return alobVar.g();
        }
        int i68 = alog.d;
        return alsx.a;
    }

    public final int g() {
        return getInt(cI(29, ParticipantsTable.a));
    }

    public final int h() {
        return getInt(cI(25, ParticipantsTable.a));
    }

    public final int i() {
        return getInt(cI(4, ParticipantsTable.a));
    }

    public final int j() {
        return getInt(cI(3, ParticipantsTable.a));
    }

    public final int k() {
        return getInt(cI(23, ParticipantsTable.a));
    }

    public final int l() {
        return getInt(cI(26, ParticipantsTable.a));
    }

    public final long m() {
        return getLong(cI(16, ParticipantsTable.a));
    }

    public final long n() {
        return getLong(cI(34, ParticipantsTable.a));
    }

    public final long o() {
        return getLong(cI(10, ParticipantsTable.a));
    }

    public final Uri p() {
        String string = getString(cI(15, ParticipantsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri q() {
        String string = getString(cI(14, ParticipantsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final mta r() {
        return mta.b(getInt(cI(39, ParticipantsTable.a)));
    }

    public final ndp s() {
        byte[] blob = getBlob(cI(44, ParticipantsTable.a));
        if (blob == null) {
            return null;
        }
        try {
            return (ndp) apag.parseFrom(ndp.a, blob, aozs.a());
        } catch (Throwable unused) {
            return ndp.a;
        }
    }

    public final qwe t() {
        return riw.m(getString(cI(1, ParticipantsTable.a)));
    }

    public final qwe u() {
        return riw.m(getString(cI(2, ParticipantsTable.a)));
    }

    public final rxg v() {
        return vcp.l(getString(cI(40, ParticipantsTable.a)));
    }

    public final tqr w() {
        tqr[] values = tqr.values();
        int i = getInt(cI(31, ParticipantsTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final vov x() {
        return vov.b(getInt(cI(43, ParticipantsTable.a)));
    }

    public final vox y() {
        return vox.b(getInt(cI(41, ParticipantsTable.a)));
    }

    public final vox z() {
        return vox.b(getInt(cI(42, ParticipantsTable.a)));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
