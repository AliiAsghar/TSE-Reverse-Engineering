package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sls extends agmp implements agmq {
    @Deprecated
    public sls(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, slu sluVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, sly.a, agoxVar, akkwVar, sluVar);
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new sln();
    }

    public final int c() {
        return getInt(cI(2, sly.a));
    }

    public final long e() {
        return getLong(cI(0, sly.a));
    }

    public final long f() {
        return getLong(cI(9, sly.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        long[] jArr;
        MessageIdType[] messageIdTypeArr;
        int[] iArr;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        rve[] rveVarArr;
        rve[] rveVarArr2;
        int i;
        boolean[] zArr;
        int i2;
        long[] jArr2;
        long[] jArr3;
        int i3;
        alob alobVar;
        alob alobVar2;
        agpf agpfVar = agoaVar.a.e;
        final int i4 = 1;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            final int i5 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(0, sly.a))));
                    } else {
                        jArr = new long[]{e()};
                    }
                } else {
                    jArr = null;
                }
                agmp.dr(length, jArr, new alhr(this) { // from class: slq
                    public final /* synthetic */ sls a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i4) {
                            case 0:
                                return "message_id:".concat(String.valueOf(this.a.getString(1)));
                            case 1:
                                return "_id:".concat(String.valueOf(this.a.getString(0)));
                            case 2:
                                return "conversation_suggestion_type:".concat(String.valueOf(this.a.getString(2)));
                            case 3:
                                return "properties:".concat(String.valueOf(this.a.getString(3)));
                            case 4:
                                return "post_back_data:".concat(String.valueOf(this.a.getString(4)));
                            case 5:
                                return "post_back_encoding:".concat(String.valueOf(this.a.getString(5)));
                            case 6:
                                return "rcs_message_id:".concat(String.valueOf(this.a.getString(6)));
                            default:
                                return "target_rcs_message_id:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(1)) {
                    if (z) {
                        long[] dl = dl(getString(cI(1, sly.a)));
                        int length2 = dl.length;
                        MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                        for (int i6 = 0; i6 < length2; i6++) {
                            messageIdTypeArr2[i6] = new MessageIdType(dl[i6]);
                        }
                        messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr2, new MessageIdType[0]);
                    } else {
                        messageIdTypeArr = new MessageIdType[]{g()};
                    }
                } else {
                    messageIdTypeArr = null;
                }
                agmp.ds(length, messageIdTypeArr, new alhr(this) { // from class: slq
                    public final /* synthetic */ sls a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i5) {
                            case 0:
                                return "message_id:".concat(String.valueOf(this.a.getString(1)));
                            case 1:
                                return "_id:".concat(String.valueOf(this.a.getString(0)));
                            case 2:
                                return "conversation_suggestion_type:".concat(String.valueOf(this.a.getString(2)));
                            case 3:
                                return "properties:".concat(String.valueOf(this.a.getString(3)));
                            case 4:
                                return "post_back_data:".concat(String.valueOf(this.a.getString(4)));
                            case 5:
                                return "post_back_encoding:".concat(String.valueOf(this.a.getString(5)));
                            case 6:
                                return "rcs_message_id:".concat(String.valueOf(this.a.getString(6)));
                            default:
                                return "target_rcs_message_id:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                final int i7 = 2;
                if (db(2)) {
                    if (z) {
                        iArr = agnc.w(null, dk(getString(cI(2, sly.a))));
                    } else {
                        iArr = new int[]{c()};
                    }
                } else {
                    iArr = null;
                }
                agmp.dq(length, iArr, new alhr(this) { // from class: slq
                    public final /* synthetic */ sls a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i7) {
                            case 0:
                                return "message_id:".concat(String.valueOf(this.a.getString(1)));
                            case 1:
                                return "_id:".concat(String.valueOf(this.a.getString(0)));
                            case 2:
                                return "conversation_suggestion_type:".concat(String.valueOf(this.a.getString(2)));
                            case 3:
                                return "properties:".concat(String.valueOf(this.a.getString(3)));
                            case 4:
                                return "post_back_data:".concat(String.valueOf(this.a.getString(4)));
                            case 5:
                                return "post_back_encoding:".concat(String.valueOf(this.a.getString(5)));
                            case 6:
                                return "rcs_message_id:".concat(String.valueOf(this.a.getString(6)));
                            default:
                                return "target_rcs_message_id:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                final int i8 = 3;
                if (db(3)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(3, sly.a))), new String[0]);
                    } else {
                        strArr = new String[]{l()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new alhr(this) { // from class: slq
                    public final /* synthetic */ sls a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i8) {
                            case 0:
                                return "message_id:".concat(String.valueOf(this.a.getString(1)));
                            case 1:
                                return "_id:".concat(String.valueOf(this.a.getString(0)));
                            case 2:
                                return "conversation_suggestion_type:".concat(String.valueOf(this.a.getString(2)));
                            case 3:
                                return "properties:".concat(String.valueOf(this.a.getString(3)));
                            case 4:
                                return "post_back_data:".concat(String.valueOf(this.a.getString(4)));
                            case 5:
                                return "post_back_encoding:".concat(String.valueOf(this.a.getString(5)));
                            case 6:
                                return "rcs_message_id:".concat(String.valueOf(this.a.getString(6)));
                            default:
                                return "target_rcs_message_id:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                final int i9 = 4;
                if (db(4)) {
                    if (z) {
                        strArr2 = (String[]) agnc.z(null, dm(getString(cI(4, sly.a))), new String[0]);
                    } else {
                        strArr2 = new String[]{j()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new alhr(this) { // from class: slq
                    public final /* synthetic */ sls a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i9) {
                            case 0:
                                return "message_id:".concat(String.valueOf(this.a.getString(1)));
                            case 1:
                                return "_id:".concat(String.valueOf(this.a.getString(0)));
                            case 2:
                                return "conversation_suggestion_type:".concat(String.valueOf(this.a.getString(2)));
                            case 3:
                                return "properties:".concat(String.valueOf(this.a.getString(3)));
                            case 4:
                                return "post_back_data:".concat(String.valueOf(this.a.getString(4)));
                            case 5:
                                return "post_back_encoding:".concat(String.valueOf(this.a.getString(5)));
                            case 6:
                                return "rcs_message_id:".concat(String.valueOf(this.a.getString(6)));
                            default:
                                return "target_rcs_message_id:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                final int i10 = 5;
                if (db(5)) {
                    if (z) {
                        strArr3 = (String[]) agnc.z(null, dm(getString(cI(5, sly.a))), new String[0]);
                    } else {
                        strArr3 = new String[]{k()};
                    }
                } else {
                    strArr3 = null;
                }
                agmp.ds(length, strArr3, new alhr(this) { // from class: slq
                    public final /* synthetic */ sls a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i10) {
                            case 0:
                                return "message_id:".concat(String.valueOf(this.a.getString(1)));
                            case 1:
                                return "_id:".concat(String.valueOf(this.a.getString(0)));
                            case 2:
                                return "conversation_suggestion_type:".concat(String.valueOf(this.a.getString(2)));
                            case 3:
                                return "properties:".concat(String.valueOf(this.a.getString(3)));
                            case 4:
                                return "post_back_data:".concat(String.valueOf(this.a.getString(4)));
                            case 5:
                                return "post_back_encoding:".concat(String.valueOf(this.a.getString(5)));
                            case 6:
                                return "rcs_message_id:".concat(String.valueOf(this.a.getString(6)));
                            default:
                                return "target_rcs_message_id:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(6)) {
                    if (z) {
                        String[] dm = dm(getString(cI(6, sly.a)));
                        int length3 = dm.length;
                        rve[] rveVarArr3 = new rve[length3];
                        for (int i11 = 0; i11 < length3; i11++) {
                            rveVarArr3[i11] = rve.a(dm[i11]);
                        }
                        rveVarArr = (rve[]) agnc.z(null, rveVarArr3, new rve[0]);
                    } else {
                        rveVarArr = new rve[]{h()};
                    }
                } else {
                    rveVarArr = null;
                }
                final int i12 = 6;
                agmp.ds(length, rveVarArr, new alhr(this) { // from class: slq
                    public final /* synthetic */ sls a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i12) {
                            case 0:
                                return "message_id:".concat(String.valueOf(this.a.getString(1)));
                            case 1:
                                return "_id:".concat(String.valueOf(this.a.getString(0)));
                            case 2:
                                return "conversation_suggestion_type:".concat(String.valueOf(this.a.getString(2)));
                            case 3:
                                return "properties:".concat(String.valueOf(this.a.getString(3)));
                            case 4:
                                return "post_back_data:".concat(String.valueOf(this.a.getString(4)));
                            case 5:
                                return "post_back_encoding:".concat(String.valueOf(this.a.getString(5)));
                            case 6:
                                return "rcs_message_id:".concat(String.valueOf(this.a.getString(6)));
                            default:
                                return "target_rcs_message_id:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(7)) {
                    if (z) {
                        String[] dm2 = dm(getString(cI(7, sly.a)));
                        int length4 = dm2.length;
                        rve[] rveVarArr4 = new rve[length4];
                        while (i5 < length4) {
                            rveVarArr4[i5] = rve.a(dm2[i5]);
                            i5++;
                        }
                        rveVarArr2 = (rve[]) agnc.z(null, rveVarArr4, new rve[0]);
                    } else {
                        rveVarArr2 = new rve[]{i()};
                    }
                } else {
                    rveVarArr2 = null;
                }
                final int i13 = 7;
                agmp.ds(length, rveVarArr2, new alhr(this) { // from class: slq
                    public final /* synthetic */ sls a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i13) {
                            case 0:
                                return "message_id:".concat(String.valueOf(this.a.getString(1)));
                            case 1:
                                return "_id:".concat(String.valueOf(this.a.getString(0)));
                            case 2:
                                return "conversation_suggestion_type:".concat(String.valueOf(this.a.getString(2)));
                            case 3:
                                return "properties:".concat(String.valueOf(this.a.getString(3)));
                            case 4:
                                return "post_back_data:".concat(String.valueOf(this.a.getString(4)));
                            case 5:
                                return "post_back_encoding:".concat(String.valueOf(this.a.getString(5)));
                            case 6:
                                return "rcs_message_id:".concat(String.valueOf(this.a.getString(6)));
                            default:
                                return "target_rcs_message_id:".concat(String.valueOf(this.a.getString(7)));
                        }
                    }
                });
                if (db(8)) {
                    if (z) {
                        zArr = agnc.A(null, dn(getString(cI(8, sly.a))));
                        i = 1;
                    } else {
                        i = 1;
                        zArr = new boolean[]{m()};
                    }
                } else {
                    i = 1;
                    zArr = null;
                }
                agmp.dt(length, zArr, new slr(this, i));
                if (db(9)) {
                    if (z) {
                        jArr2 = agnc.y(null, dl(getString(cI(9, sly.a))));
                        i2 = 0;
                    } else {
                        jArr2 = new long[]{f()};
                        i2 = 0;
                    }
                } else {
                    i2 = 0;
                    jArr2 = null;
                }
                agmp.dr(length, jArr2, new slr(this, i2));
                alob alobVar3 = new alob();
                int i14 = 0;
                while (i14 < length) {
                    long j = du[i14];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i14]));
                        String[] strArr4 = sly.a;
                        int i15 = ske.a;
                        slo sloVar = new slo();
                        sloVar.aD();
                        sloVar.aB();
                        long j2 = du[i14];
                        if (jArr != null) {
                            i3 = length;
                            alobVar2 = alobVar3;
                            long j3 = jArr[i14];
                            jArr3 = du;
                            sloVar.aC(0);
                            sloVar.a = j3;
                        } else {
                            jArr3 = du;
                            i3 = length;
                            alobVar2 = alobVar3;
                        }
                        if (messageIdTypeArr != null) {
                            sloVar.i(messageIdTypeArr[i14]);
                        }
                        if (iArr != null) {
                            sloVar.b(iArr[i14]);
                        }
                        if (strArr != null) {
                            sloVar.e(strArr[i14]);
                        }
                        if (strArr2 != null) {
                            sloVar.c(strArr2[i14]);
                        }
                        if (strArr3 != null) {
                            sloVar.d(strArr3[i14]);
                        }
                        if (rveVarArr != null) {
                            sloVar.f(rveVarArr[i14]);
                        }
                        if (rveVarArr2 != null) {
                            sloVar.j(rveVarArr2[i14]);
                        }
                        if (zArr != null) {
                            sloVar.g(zArr[i14]);
                        }
                        if (jArr2 != null) {
                            sloVar.h(jArr2[i14]);
                        }
                        alobVar = alobVar2;
                        alobVar.h(sloVar.a());
                    } else {
                        jArr3 = du;
                        i3 = length;
                        alobVar = alobVar3;
                    }
                    i14++;
                    alobVar3 = alobVar;
                    length = i3;
                    du = jArr3;
                }
                return alobVar3.g();
            }
        }
        int i16 = alog.d;
        return alsx.a;
    }

    public final MessageIdType g() {
        return new MessageIdType(getLong(cI(1, sly.a)));
    }

    public final rve h() {
        return rve.a(getString(cI(6, sly.a)));
    }

    public final rve i() {
        return rve.a(getString(cI(7, sly.a)));
    }

    public final String j() {
        return getString(cI(4, sly.a));
    }

    public final String k() {
        return getString(cI(5, sly.a));
    }

    public final String l() {
        return getString(cI(3, sly.a));
    }

    public final boolean m() {
        if (getInt(cI(8, sly.a)) == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
