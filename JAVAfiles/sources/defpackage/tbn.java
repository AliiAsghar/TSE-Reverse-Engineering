package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tbn extends agmp<tbn, tbr, tbs, PartsTable.BindData, tbi> implements agmq {
    @Deprecated
    public tbn(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, agox agoxVar, akkw akkwVar, tbr tbrVar) {
        super(agnwVar, cursor, strArr, agpjVarArr, PartsTable.a, agoxVar, akkwVar, tbrVar);
    }

    public final tqa A() {
        return wch.I(getString(cI(15, PartsTable.a)));
    }

    public final tqd B() {
        tqd[] values = tqd.values();
        int i = getInt(cI(13, PartsTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tqi C() {
        tqi[] values = tqi.values();
        int i = getInt(cI(50, PartsTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tqj D() {
        tqj[] values = tqj.values();
        int i = getInt(cI(45, PartsTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tql E() {
        tql[] values = tql.values();
        int i = getInt(cI(12, PartsTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tqq F() {
        tqq[] values = tqq.values();
        int i = getInt(cI(49, PartsTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final tqw G() {
        tqw[] values = tqw.values();
        int i = getInt(cI(47, PartsTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final aggp H() {
        byte[] blob = getBlob(cI(46, PartsTable.a));
        if (blob == null) {
            return null;
        }
        try {
            return (aggp) apag.parseFrom(aggp.a, blob, aozs.a());
        } catch (Throwable unused) {
            return aggp.a;
        }
    }

    public final String I() {
        return getString(cI(26, PartsTable.a));
    }

    public final String J() {
        return getString(cI(25, PartsTable.a));
    }

    public final String K() {
        return getString(cI(36, PartsTable.a));
    }

    public final String L() {
        return getString(cI(27, PartsTable.a));
    }

    public final String M() {
        return getString(cI(35, PartsTable.a));
    }

    public final String N() {
        return getString(cI(4, PartsTable.a));
    }

    public final String O() {
        return getString(cI(32, PartsTable.a));
    }

    public final String P() {
        return getString(cI(33, PartsTable.a));
    }

    public final String Q() {
        return getString(cI(0, PartsTable.a));
    }

    public final String R() {
        return getString(cI(44, PartsTable.a));
    }

    public final String S() {
        return getString(cI(21, PartsTable.a));
    }

    public final String T() {
        return yta.a(getString(cI(2, PartsTable.a)));
    }

    public final boolean U() {
        if (getInt(cI(42, PartsTable.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean V() {
        if (getInt(cI(30, PartsTable.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean W() {
        if (getInt(cI(37, PartsTable.a)) == 1) {
            return true;
        }
        return false;
    }

    public final boolean X() {
        if (getInt(cI(41, PartsTable.a)) == 1) {
            return true;
        }
        return false;
    }

    public final byte[] Y() {
        return getBlob(cI(29, PartsTable.a));
    }

    public final byte[] Z() {
        return getBlob(cI(28, PartsTable.a));
    }

    public final byte[] aa() {
        return getBlob(cI(40, PartsTable.a));
    }

    public final byte[] ab() {
        return getBlob(cI(39, PartsTable.a));
    }

    public final int[] ac() {
        return agnc.w(null, dk(getString(cI(24, PartsTable.a))));
    }

    public final long[] ad() {
        return agnc.y(null, dl(getString(cI(31, PartsTable.a))));
    }

    public final long[] ae() {
        return agnc.y(null, dl(getString(cI(38, PartsTable.a))));
    }

    public final long[] af() {
        return agnc.y(null, dl(getString(cI(34, PartsTable.a))));
    }

    public final Uri[] ag() {
        String[] dm = dm(getString(cI(22, PartsTable.a)));
        int length = dm.length;
        Uri[] uriArr = new Uri[length];
        int i = 0;
        int i2 = 0;
        while (true) {
            Uri uri = null;
            if (i < length) {
                String str = dm[i];
                int i3 = i2 + 1;
                if (str != null && str.length() != 0) {
                    uri = Uri.parse(str);
                }
                uriArr[i2] = uri;
                i++;
                i2 = i3;
            } else {
                return (Uri[]) agnc.z(null, uriArr, new Uri[0]);
            }
        }
    }

    public final ConversationIdType[] ah() {
        long[] dl = dl(getString(cI(14, PartsTable.a)));
        int length = dl.length;
        ConversationIdType[] conversationIdTypeArr = new ConversationIdType[length];
        for (int i = 0; i < length; i++) {
            conversationIdTypeArr[i] = new ConversationIdType(dl[i]);
        }
        return (ConversationIdType[]) agnc.z(null, conversationIdTypeArr, new ConversationIdType[0]);
    }

    public final tqd[] ai() {
        int[] dk = dk(getString(cI(13, PartsTable.a)));
        tqd[] values = tqd.values();
        int length = values.length;
        tqd[] tqdVarArr = new tqd[dk.length];
        for (int i = 0; i < dk.length; i++) {
            int i2 = dk[i];
            if (i2 < length) {
                tqdVarArr[i] = values[i2];
            } else {
                throw new IllegalStateException();
            }
        }
        return (tqd[]) agnc.z(null, tqdVarArr, new tqd[0]);
    }

    public final tqi[] aj() {
        int[] dk = dk(getString(cI(50, PartsTable.a)));
        tqi[] values = tqi.values();
        int length = values.length;
        tqi[] tqiVarArr = new tqi[dk.length];
        for (int i = 0; i < dk.length; i++) {
            int i2 = dk[i];
            if (i2 < length) {
                tqiVarArr[i] = values[i2];
            } else {
                throw new IllegalStateException();
            }
        }
        return (tqi[]) agnc.z(null, tqiVarArr, new tqi[0]);
    }

    public final String[] ak() {
        return (String[]) agnc.z(null, dm(getString(cI(26, PartsTable.a))), new String[0]);
    }

    public final String[] al() {
        return (String[]) agnc.z(null, dm(getString(cI(25, PartsTable.a))), new String[0]);
    }

    public final String[] am() {
        return (String[]) agnc.z(null, dm(getString(cI(36, PartsTable.a))), new String[0]);
    }

    public final String[] an() {
        return (String[]) agnc.z(null, dm(getString(cI(27, PartsTable.a))), new String[0]);
    }

    public final String[] ao() {
        return (String[]) agnc.z(null, dm(getString(cI(35, PartsTable.a))), new String[0]);
    }

    public final String[] ap() {
        return (String[]) agnc.z(null, dm(getString(cI(4, PartsTable.a))), new String[0]);
    }

    public final String[] aq() {
        return (String[]) agnc.z(null, dm(getString(cI(32, PartsTable.a))), new String[0]);
    }

    public final String[] ar() {
        return (String[]) agnc.z(null, dm(getString(cI(33, PartsTable.a))), new String[0]);
    }

    public final boolean[] as() {
        return agnc.A(null, dn(getString(cI(42, PartsTable.a))));
    }

    public final boolean[] at() {
        return agnc.A(null, dn(getString(cI(30, PartsTable.a))));
    }

    public final boolean[] au() {
        return agnc.A(null, dn(getString(cI(37, PartsTable.a))));
    }

    public final byte[][] av() {
        return agnc.B(null, dv(getString(cI(29, PartsTable.a))));
    }

    public final byte[][] aw() {
        return agnc.B(null, dv(getString(cI(28, PartsTable.a))));
    }

    public final byte[][] ax() {
        return agnc.B(null, dv(getString(cI(40, PartsTable.a))));
    }

    @Override // defpackage.agmp
    public final /* synthetic */ aglz b() {
        return new tbf();
    }

    public final double c() {
        return getDouble(cI(19, PartsTable.a));
    }

    public final double e() {
        return getDouble(cI(18, PartsTable.a));
    }

    public final int f() {
        return getInt(cI(24, PartsTable.a));
    }

    @Override // defpackage.agmp
    public final alog fr(agoa agoaVar) {
        String[] strArr;
        MessageIdType[] messageIdTypeArr;
        String[] strArr2;
        Uri[] uriArr;
        String[] strArr3;
        Uri[] uriArr2;
        final int i;
        Uri[] uriArr3;
        int[] iArr;
        int[] iArr2;
        long[] jArr;
        long[] jArr2;
        int[] iArr3;
        Uri[] uriArr4;
        long[] jArr3;
        Uri[] uriArr5;
        Uri[] uriArr6;
        Uri[] uriArr7;
        long[] jArr4;
        tql[] tqlVarArr;
        tqd[] tqdVarArr;
        ConversationIdType[] conversationIdTypeArr;
        ConversationIdType[] conversationIdTypeArr2;
        tqa[] tqaVarArr;
        tqa[] tqaVarArr2;
        tqa[] tqaVarArr3;
        int i2;
        long[] jArr5;
        int i3;
        long[] jArr6;
        double[] dArr;
        double[] dArr2;
        tqa[] tqaVarArr4;
        double[] dArr3;
        Uri[] uriArr8;
        String[] strArr4;
        Uri[] uriArr9;
        int[] iArr4;
        int[] iArr5;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        byte[][] bArr;
        byte[][] bArr2;
        boolean[] zArr;
        long[] jArr7;
        String[] strArr8;
        String[] strArr9;
        long[] jArr8;
        final int i4;
        long[] jArr9;
        String[] strArr10;
        String[] strArr11;
        final int i5;
        String[] strArr12;
        String[] strArr13;
        boolean[] zArr2;
        long[] jArr10;
        byte[][] bArr3;
        byte[][] bArr4;
        boolean[] zArr3;
        boolean[] zArr4;
        long[] jArr11;
        long[] jArr12;
        String[] strArr14;
        tqd[] tqdVarArr2;
        Uri[] uriArr10;
        String[] strArr15;
        tql[] tqlVarArr2;
        tqj[] tqjVarArr;
        aggp[] aggpVarArr;
        aggp[] aggpVarArr2;
        tqj[] tqjVarArr2;
        tqw[] tqwVarArr;
        pyz[] pyzVarArr;
        pyz[] pyzVarArr2;
        tqw[] tqwVarArr2;
        tqi[] tqiVarArr;
        tqq[] tqqVarArr;
        int i6;
        tqi[] tqiVarArr2;
        Iterator it;
        aggp aggpVar;
        Uri uri;
        Uri uri2;
        Uri uri3;
        Uri uri4;
        Uri uri5;
        agpf agpfVar = agoaVar.a.e;
        long[] du = du(getString(agoaVar.h + 1));
        int length = du.length;
        if (length != 0) {
            final int i7 = 0;
            if (length != 1 || du[0] != -1) {
                HashSet hashSet = new HashSet();
                boolean z = this.i.b;
                if (db(0)) {
                    if (z) {
                        strArr = (String[]) agnc.z(null, dm(getString(cI(0, PartsTable.a))), new String[0]);
                    } else {
                        strArr = new String[]{Q()};
                    }
                } else {
                    strArr = null;
                }
                agmp.ds(length, strArr, new tbj(this, i7));
                if (db(1)) {
                    if (z) {
                        long[] dl = dl(getString(cI(1, PartsTable.a)));
                        int length2 = dl.length;
                        MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                        for (int i8 = 0; i8 < length2; i8++) {
                            messageIdTypeArr2[i8] = new MessageIdType(dl[i8]);
                        }
                        messageIdTypeArr = (MessageIdType[]) agnc.z(null, messageIdTypeArr2, new MessageIdType[0]);
                    } else {
                        messageIdTypeArr = new MessageIdType[]{y()};
                    }
                } else {
                    messageIdTypeArr = null;
                }
                agmp.ds(length, messageIdTypeArr, new tbj(this, 3));
                if (db(2)) {
                    if (z) {
                        String[] dm = dm(getString(cI(2, PartsTable.a)));
                        for (int i9 = 0; i9 < dm.length; i9++) {
                            dm[i9] = yta.a(dm[i9]);
                        }
                        strArr2 = (String[]) agnc.z(null, dm, new String[0]);
                    } else {
                        strArr2 = new String[]{T()};
                    }
                } else {
                    strArr2 = null;
                }
                agmp.ds(length, strArr2, new tbj(this, 15));
                if (db(3)) {
                    if (z) {
                        String[] dm2 = dm(getString(cI(3, PartsTable.a)));
                        int length3 = dm2.length;
                        Uri[] uriArr11 = new Uri[length3];
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length3) {
                            String str = dm2[i10];
                            int i12 = i11 + 1;
                            if (str != null && str.length() != 0) {
                                uri5 = Uri.parse(str);
                            } else {
                                uri5 = null;
                            }
                            uriArr11[i11] = uri5;
                            i10++;
                            i11 = i12;
                        }
                        uriArr = (Uri[]) agnc.z(null, uriArr11, new Uri[0]);
                    } else {
                        uriArr = new Uri[]{v()};
                    }
                } else {
                    uriArr = null;
                }
                final int i13 = 6;
                agmp.ds(length, uriArr, new alhr(this) { // from class: tbk
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i13) {
                            case 0:
                                return "cms_compressed_blob_id:".concat(String.valueOf(this.a.getString(36)));
                            case 1:
                                return "compressed_blob_id:".concat(String.valueOf(this.a.getString(35)));
                            case 2:
                                return "target_size:".concat(String.valueOf(this.a.getString(11)));
                            case 3:
                                return "compressed_blob_upload_permanent_failure:".concat(String.valueOf(this.a.getString(37)));
                            case 4:
                                return "compressed_blob_upload_timestamp:".concat(String.valueOf(this.a.getString(38)));
                            case 5:
                                return "media_encryption_key:".concat(String.valueOf(this.a.getString(39)));
                            case 6:
                                return "uri:".concat(String.valueOf(this.a.getString(3)));
                            case 7:
                                return "compressed_media_encryption_key:".concat(String.valueOf(this.a.getString(40)));
                            case 8:
                                return "missing_entry_in_telephony:".concat(String.valueOf(this.a.getString(41)));
                            case 9:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(42)));
                            case 10:
                                return "file_size_bytes:".concat(String.valueOf(this.a.getString(43)));
                            case 11:
                                return "local_cache_path:".concat(String.valueOf(this.a.getString(44)));
                            case 12:
                                return "media_send_type:".concat(String.valueOf(this.a.getString(45)));
                            case 13:
                                return "processing_status:".concat(String.valueOf(this.a.getString(12)));
                            case 14:
                                return "voice_metadata:".concat(String.valueOf(this.a.getString(46)));
                            case 15:
                                return "validation_status:".concat(String.valueOf(this.a.getString(47)));
                            case 16:
                                return "processing_id:".concat(String.valueOf(this.a.getString(48)));
                            case 17:
                                return "rich_card_media_download_failure_reason:".concat(String.valueOf(this.a.getString(49)));
                            case 18:
                                return "content_type:".concat(String.valueOf(this.a.getString(4)));
                            case 19:
                                return "image_display_state:".concat(String.valueOf(this.a.getString(50)));
                            default:
                                return "original_uri:".concat(String.valueOf(this.a.getString(5)));
                        }
                    }
                });
                if (db(4)) {
                    if (z) {
                        strArr3 = ap();
                    } else {
                        strArr3 = new String[]{N()};
                    }
                } else {
                    strArr3 = null;
                }
                final int i14 = 18;
                agmp.ds(length, strArr3, new alhr(this) { // from class: tbk
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i14) {
                            case 0:
                                return "cms_compressed_blob_id:".concat(String.valueOf(this.a.getString(36)));
                            case 1:
                                return "compressed_blob_id:".concat(String.valueOf(this.a.getString(35)));
                            case 2:
                                return "target_size:".concat(String.valueOf(this.a.getString(11)));
                            case 3:
                                return "compressed_blob_upload_permanent_failure:".concat(String.valueOf(this.a.getString(37)));
                            case 4:
                                return "compressed_blob_upload_timestamp:".concat(String.valueOf(this.a.getString(38)));
                            case 5:
                                return "media_encryption_key:".concat(String.valueOf(this.a.getString(39)));
                            case 6:
                                return "uri:".concat(String.valueOf(this.a.getString(3)));
                            case 7:
                                return "compressed_media_encryption_key:".concat(String.valueOf(this.a.getString(40)));
                            case 8:
                                return "missing_entry_in_telephony:".concat(String.valueOf(this.a.getString(41)));
                            case 9:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(42)));
                            case 10:
                                return "file_size_bytes:".concat(String.valueOf(this.a.getString(43)));
                            case 11:
                                return "local_cache_path:".concat(String.valueOf(this.a.getString(44)));
                            case 12:
                                return "media_send_type:".concat(String.valueOf(this.a.getString(45)));
                            case 13:
                                return "processing_status:".concat(String.valueOf(this.a.getString(12)));
                            case 14:
                                return "voice_metadata:".concat(String.valueOf(this.a.getString(46)));
                            case 15:
                                return "validation_status:".concat(String.valueOf(this.a.getString(47)));
                            case 16:
                                return "processing_id:".concat(String.valueOf(this.a.getString(48)));
                            case 17:
                                return "rich_card_media_download_failure_reason:".concat(String.valueOf(this.a.getString(49)));
                            case 18:
                                return "content_type:".concat(String.valueOf(this.a.getString(4)));
                            case 19:
                                return "image_display_state:".concat(String.valueOf(this.a.getString(50)));
                            default:
                                return "original_uri:".concat(String.valueOf(this.a.getString(5)));
                        }
                    }
                });
                if (db(5)) {
                    if (z) {
                        String[] dm3 = dm(getString(cI(5, PartsTable.a)));
                        int length4 = dm3.length;
                        Uri[] uriArr12 = new Uri[length4];
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < length4) {
                            String str2 = dm3[i15];
                            int i17 = i16 + 1;
                            if (str2 != null && str2.length() != 0) {
                                uri4 = Uri.parse(str2);
                            } else {
                                uri4 = null;
                            }
                            uriArr12[i16] = uri4;
                            i15++;
                            i16 = i17;
                        }
                        uriArr2 = (Uri[]) agnc.z(null, uriArr12, new Uri[0]);
                    } else {
                        uriArr2 = new Uri[]{r()};
                    }
                } else {
                    uriArr2 = null;
                }
                final int i18 = 20;
                agmp.ds(length, uriArr2, new alhr(this) { // from class: tbk
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i18) {
                            case 0:
                                return "cms_compressed_blob_id:".concat(String.valueOf(this.a.getString(36)));
                            case 1:
                                return "compressed_blob_id:".concat(String.valueOf(this.a.getString(35)));
                            case 2:
                                return "target_size:".concat(String.valueOf(this.a.getString(11)));
                            case 3:
                                return "compressed_blob_upload_permanent_failure:".concat(String.valueOf(this.a.getString(37)));
                            case 4:
                                return "compressed_blob_upload_timestamp:".concat(String.valueOf(this.a.getString(38)));
                            case 5:
                                return "media_encryption_key:".concat(String.valueOf(this.a.getString(39)));
                            case 6:
                                return "uri:".concat(String.valueOf(this.a.getString(3)));
                            case 7:
                                return "compressed_media_encryption_key:".concat(String.valueOf(this.a.getString(40)));
                            case 8:
                                return "missing_entry_in_telephony:".concat(String.valueOf(this.a.getString(41)));
                            case 9:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(42)));
                            case 10:
                                return "file_size_bytes:".concat(String.valueOf(this.a.getString(43)));
                            case 11:
                                return "local_cache_path:".concat(String.valueOf(this.a.getString(44)));
                            case 12:
                                return "media_send_type:".concat(String.valueOf(this.a.getString(45)));
                            case 13:
                                return "processing_status:".concat(String.valueOf(this.a.getString(12)));
                            case 14:
                                return "voice_metadata:".concat(String.valueOf(this.a.getString(46)));
                            case 15:
                                return "validation_status:".concat(String.valueOf(this.a.getString(47)));
                            case 16:
                                return "processing_id:".concat(String.valueOf(this.a.getString(48)));
                            case 17:
                                return "rich_card_media_download_failure_reason:".concat(String.valueOf(this.a.getString(49)));
                            case 18:
                                return "content_type:".concat(String.valueOf(this.a.getString(4)));
                            case 19:
                                return "image_display_state:".concat(String.valueOf(this.a.getString(50)));
                            default:
                                return "original_uri:".concat(String.valueOf(this.a.getString(5)));
                        }
                    }
                });
                if (db(6)) {
                    if (z) {
                        String[] dm4 = dm(getString(cI(6, PartsTable.a)));
                        int length5 = dm4.length;
                        Uri[] uriArr13 = new Uri[length5];
                        int i19 = 0;
                        int i20 = 0;
                        while (i19 < length5) {
                            String str3 = dm4[i19];
                            int i21 = i20 + 1;
                            if (str3 != null && str3.length() != 0) {
                                uri3 = Uri.parse(str3);
                            } else {
                                uri3 = null;
                            }
                            uriArr13[i20] = uri3;
                            i19++;
                            i20 = i21;
                        }
                        uriArr3 = (Uri[]) agnc.z(null, uriArr13, new Uri[0]);
                        i = 1;
                    } else {
                        i = 1;
                        uriArr3 = new Uri[]{u()};
                    }
                } else {
                    i = 1;
                    uriArr3 = null;
                }
                agmp.ds(length, uriArr3, new alhr(this) { // from class: tbl
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i) {
                            case 0:
                                return "width:".concat(String.valueOf(this.a.getString(7)));
                            case 1:
                                return "storage_uri:".concat(String.valueOf(this.a.getString(6)));
                            case 2:
                                return "height:".concat(String.valueOf(this.a.getString(8)));
                            case 3:
                                return "cms_attachment_processing_status:".concat(String.valueOf(this.a.getString(13)));
                            case 4:
                                return "timestamp:".concat(String.valueOf(this.a.getString(9)));
                            case 5:
                                return "conversation_id:".concat(String.valueOf(this.a.getString(14)));
                            case 6:
                                return "sticker_set_id:".concat(String.valueOf(this.a.getString(15)));
                            default:
                                return "sticker_id:".concat(String.valueOf(this.a.getString(16)));
                        }
                    }
                });
                if (db(7)) {
                    if (z) {
                        iArr = agnc.w(null, dk(getString(cI(7, PartsTable.a))));
                    } else {
                        iArr = new int[]{i()};
                    }
                } else {
                    iArr = null;
                }
                agmp.dq(length, iArr, new alhr(this) { // from class: tbl
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i7) {
                            case 0:
                                return "width:".concat(String.valueOf(this.a.getString(7)));
                            case 1:
                                return "storage_uri:".concat(String.valueOf(this.a.getString(6)));
                            case 2:
                                return "height:".concat(String.valueOf(this.a.getString(8)));
                            case 3:
                                return "cms_attachment_processing_status:".concat(String.valueOf(this.a.getString(13)));
                            case 4:
                                return "timestamp:".concat(String.valueOf(this.a.getString(9)));
                            case 5:
                                return "conversation_id:".concat(String.valueOf(this.a.getString(14)));
                            case 6:
                                return "sticker_set_id:".concat(String.valueOf(this.a.getString(15)));
                            default:
                                return "sticker_id:".concat(String.valueOf(this.a.getString(16)));
                        }
                    }
                });
                if (db(8)) {
                    if (z) {
                        iArr2 = agnc.w(null, dk(getString(cI(8, PartsTable.a))));
                    } else {
                        iArr2 = new int[]{g()};
                    }
                } else {
                    iArr2 = null;
                }
                final int i22 = 2;
                agmp.dq(length, iArr2, new alhr(this) { // from class: tbl
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i22) {
                            case 0:
                                return "width:".concat(String.valueOf(this.a.getString(7)));
                            case 1:
                                return "storage_uri:".concat(String.valueOf(this.a.getString(6)));
                            case 2:
                                return "height:".concat(String.valueOf(this.a.getString(8)));
                            case 3:
                                return "cms_attachment_processing_status:".concat(String.valueOf(this.a.getString(13)));
                            case 4:
                                return "timestamp:".concat(String.valueOf(this.a.getString(9)));
                            case 5:
                                return "conversation_id:".concat(String.valueOf(this.a.getString(14)));
                            case 6:
                                return "sticker_set_id:".concat(String.valueOf(this.a.getString(15)));
                            default:
                                return "sticker_id:".concat(String.valueOf(this.a.getString(16)));
                        }
                    }
                });
                if (db(9)) {
                    if (z) {
                        jArr = agnc.y(null, dl(getString(cI(9, PartsTable.a))));
                    } else {
                        jArr = new long[]{p()};
                    }
                } else {
                    jArr = null;
                }
                int[] iArr6 = iArr2;
                final int i23 = 4;
                agmp.dr(length, jArr, new alhr(this) { // from class: tbl
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i23) {
                            case 0:
                                return "width:".concat(String.valueOf(this.a.getString(7)));
                            case 1:
                                return "storage_uri:".concat(String.valueOf(this.a.getString(6)));
                            case 2:
                                return "height:".concat(String.valueOf(this.a.getString(8)));
                            case 3:
                                return "cms_attachment_processing_status:".concat(String.valueOf(this.a.getString(13)));
                            case 4:
                                return "timestamp:".concat(String.valueOf(this.a.getString(9)));
                            case 5:
                                return "conversation_id:".concat(String.valueOf(this.a.getString(14)));
                            case 6:
                                return "sticker_set_id:".concat(String.valueOf(this.a.getString(15)));
                            default:
                                return "sticker_id:".concat(String.valueOf(this.a.getString(16)));
                        }
                    }
                });
                if (db(10)) {
                    if (z) {
                        String[] dm5 = dm(getString(cI(10, PartsTable.a)));
                        int length6 = dm5.length;
                        jArr2 = jArr;
                        Uri[] uriArr14 = new Uri[length6];
                        iArr3 = iArr;
                        int i24 = 0;
                        int i25 = 0;
                        while (i24 < length6) {
                            String str4 = dm5[i24];
                            int i26 = i25 + 1;
                            if (str4 != null && str4.length() != 0) {
                                uri2 = Uri.parse(str4);
                            } else {
                                uri2 = null;
                            }
                            uriArr14[i25] = uri2;
                            i24++;
                            i25 = i26;
                        }
                        uriArr4 = (Uri[]) agnc.z(null, uriArr14, new Uri[0]);
                    } else {
                        jArr2 = jArr;
                        iArr3 = iArr;
                        uriArr4 = new Uri[]{t()};
                    }
                } else {
                    jArr2 = jArr;
                    iArr3 = iArr;
                    uriArr4 = null;
                }
                agmp.ds(length, uriArr4, new tbj(this, 12));
                if (db(11)) {
                    if (z) {
                        jArr3 = agnc.y(null, dl(getString(cI(11, PartsTable.a))));
                    } else {
                        jArr3 = new long[]{o()};
                    }
                } else {
                    jArr3 = null;
                }
                final int i27 = 2;
                agmp.dr(length, jArr3, new alhr(this) { // from class: tbk
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i27) {
                            case 0:
                                return "cms_compressed_blob_id:".concat(String.valueOf(this.a.getString(36)));
                            case 1:
                                return "compressed_blob_id:".concat(String.valueOf(this.a.getString(35)));
                            case 2:
                                return "target_size:".concat(String.valueOf(this.a.getString(11)));
                            case 3:
                                return "compressed_blob_upload_permanent_failure:".concat(String.valueOf(this.a.getString(37)));
                            case 4:
                                return "compressed_blob_upload_timestamp:".concat(String.valueOf(this.a.getString(38)));
                            case 5:
                                return "media_encryption_key:".concat(String.valueOf(this.a.getString(39)));
                            case 6:
                                return "uri:".concat(String.valueOf(this.a.getString(3)));
                            case 7:
                                return "compressed_media_encryption_key:".concat(String.valueOf(this.a.getString(40)));
                            case 8:
                                return "missing_entry_in_telephony:".concat(String.valueOf(this.a.getString(41)));
                            case 9:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(42)));
                            case 10:
                                return "file_size_bytes:".concat(String.valueOf(this.a.getString(43)));
                            case 11:
                                return "local_cache_path:".concat(String.valueOf(this.a.getString(44)));
                            case 12:
                                return "media_send_type:".concat(String.valueOf(this.a.getString(45)));
                            case 13:
                                return "processing_status:".concat(String.valueOf(this.a.getString(12)));
                            case 14:
                                return "voice_metadata:".concat(String.valueOf(this.a.getString(46)));
                            case 15:
                                return "validation_status:".concat(String.valueOf(this.a.getString(47)));
                            case 16:
                                return "processing_id:".concat(String.valueOf(this.a.getString(48)));
                            case 17:
                                return "rich_card_media_download_failure_reason:".concat(String.valueOf(this.a.getString(49)));
                            case 18:
                                return "content_type:".concat(String.valueOf(this.a.getString(4)));
                            case 19:
                                return "image_display_state:".concat(String.valueOf(this.a.getString(50)));
                            default:
                                return "original_uri:".concat(String.valueOf(this.a.getString(5)));
                        }
                    }
                });
                if (db(12)) {
                    if (z) {
                        int[] dk = dk(getString(cI(12, PartsTable.a)));
                        tql[] values = tql.values();
                        jArr4 = jArr3;
                        int length7 = values.length;
                        uriArr6 = uriArr4;
                        tql[] tqlVarArr3 = new tql[dk.length];
                        uriArr5 = uriArr2;
                        uriArr7 = uriArr3;
                        for (int i28 = 0; i28 < dk.length; i28++) {
                            int i29 = dk[i28];
                            if (i29 < length7) {
                                tqlVarArr3[i28] = values[i29];
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        tqlVarArr = (tql[]) agnc.z(null, tqlVarArr3, new tql[0]);
                    } else {
                        uriArr5 = uriArr2;
                        uriArr6 = uriArr4;
                        uriArr7 = uriArr3;
                        jArr4 = jArr3;
                        tqlVarArr = new tql[]{E()};
                    }
                } else {
                    uriArr5 = uriArr2;
                    uriArr6 = uriArr4;
                    uriArr7 = uriArr3;
                    jArr4 = jArr3;
                    tqlVarArr = null;
                }
                final int i30 = 13;
                agmp.ds(length, tqlVarArr, new alhr(this) { // from class: tbk
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i30) {
                            case 0:
                                return "cms_compressed_blob_id:".concat(String.valueOf(this.a.getString(36)));
                            case 1:
                                return "compressed_blob_id:".concat(String.valueOf(this.a.getString(35)));
                            case 2:
                                return "target_size:".concat(String.valueOf(this.a.getString(11)));
                            case 3:
                                return "compressed_blob_upload_permanent_failure:".concat(String.valueOf(this.a.getString(37)));
                            case 4:
                                return "compressed_blob_upload_timestamp:".concat(String.valueOf(this.a.getString(38)));
                            case 5:
                                return "media_encryption_key:".concat(String.valueOf(this.a.getString(39)));
                            case 6:
                                return "uri:".concat(String.valueOf(this.a.getString(3)));
                            case 7:
                                return "compressed_media_encryption_key:".concat(String.valueOf(this.a.getString(40)));
                            case 8:
                                return "missing_entry_in_telephony:".concat(String.valueOf(this.a.getString(41)));
                            case 9:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(42)));
                            case 10:
                                return "file_size_bytes:".concat(String.valueOf(this.a.getString(43)));
                            case 11:
                                return "local_cache_path:".concat(String.valueOf(this.a.getString(44)));
                            case 12:
                                return "media_send_type:".concat(String.valueOf(this.a.getString(45)));
                            case 13:
                                return "processing_status:".concat(String.valueOf(this.a.getString(12)));
                            case 14:
                                return "voice_metadata:".concat(String.valueOf(this.a.getString(46)));
                            case 15:
                                return "validation_status:".concat(String.valueOf(this.a.getString(47)));
                            case 16:
                                return "processing_id:".concat(String.valueOf(this.a.getString(48)));
                            case 17:
                                return "rich_card_media_download_failure_reason:".concat(String.valueOf(this.a.getString(49)));
                            case 18:
                                return "content_type:".concat(String.valueOf(this.a.getString(4)));
                            case 19:
                                return "image_display_state:".concat(String.valueOf(this.a.getString(50)));
                            default:
                                return "original_uri:".concat(String.valueOf(this.a.getString(5)));
                        }
                    }
                });
                if (db(13)) {
                    if (z) {
                        tqdVarArr = ai();
                    } else {
                        tqdVarArr = new tqd[]{B()};
                    }
                } else {
                    tqdVarArr = null;
                }
                final int i31 = 3;
                agmp.ds(length, tqdVarArr, new alhr(this) { // from class: tbl
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i31) {
                            case 0:
                                return "width:".concat(String.valueOf(this.a.getString(7)));
                            case 1:
                                return "storage_uri:".concat(String.valueOf(this.a.getString(6)));
                            case 2:
                                return "height:".concat(String.valueOf(this.a.getString(8)));
                            case 3:
                                return "cms_attachment_processing_status:".concat(String.valueOf(this.a.getString(13)));
                            case 4:
                                return "timestamp:".concat(String.valueOf(this.a.getString(9)));
                            case 5:
                                return "conversation_id:".concat(String.valueOf(this.a.getString(14)));
                            case 6:
                                return "sticker_set_id:".concat(String.valueOf(this.a.getString(15)));
                            default:
                                return "sticker_id:".concat(String.valueOf(this.a.getString(16)));
                        }
                    }
                });
                if (db(14)) {
                    if (z) {
                        conversationIdTypeArr = ah();
                    } else {
                        conversationIdTypeArr = new ConversationIdType[]{x()};
                    }
                } else {
                    conversationIdTypeArr = null;
                }
                final int i32 = 5;
                agmp.ds(length, conversationIdTypeArr, new alhr(this) { // from class: tbl
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i32) {
                            case 0:
                                return "width:".concat(String.valueOf(this.a.getString(7)));
                            case 1:
                                return "storage_uri:".concat(String.valueOf(this.a.getString(6)));
                            case 2:
                                return "height:".concat(String.valueOf(this.a.getString(8)));
                            case 3:
                                return "cms_attachment_processing_status:".concat(String.valueOf(this.a.getString(13)));
                            case 4:
                                return "timestamp:".concat(String.valueOf(this.a.getString(9)));
                            case 5:
                                return "conversation_id:".concat(String.valueOf(this.a.getString(14)));
                            case 6:
                                return "sticker_set_id:".concat(String.valueOf(this.a.getString(15)));
                            default:
                                return "sticker_id:".concat(String.valueOf(this.a.getString(16)));
                        }
                    }
                });
                if (db(15)) {
                    if (z) {
                        String[] dm6 = dm(getString(cI(15, PartsTable.a)));
                        int length8 = dm6.length;
                        tqa[] tqaVarArr5 = new tqa[length8];
                        conversationIdTypeArr2 = conversationIdTypeArr;
                        for (int i33 = 0; i33 < length8; i33++) {
                            tqaVarArr5[i33] = wch.I(dm6[i33]);
                        }
                        tqaVarArr = (tqa[]) agnc.z(null, tqaVarArr5, new tqa[0]);
                    } else {
                        conversationIdTypeArr2 = conversationIdTypeArr;
                        tqaVarArr = new tqa[]{A()};
                    }
                } else {
                    conversationIdTypeArr2 = conversationIdTypeArr;
                    tqaVarArr = null;
                }
                final int i34 = 6;
                agmp.ds(length, tqaVarArr, new alhr(this) { // from class: tbl
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i34) {
                            case 0:
                                return "width:".concat(String.valueOf(this.a.getString(7)));
                            case 1:
                                return "storage_uri:".concat(String.valueOf(this.a.getString(6)));
                            case 2:
                                return "height:".concat(String.valueOf(this.a.getString(8)));
                            case 3:
                                return "cms_attachment_processing_status:".concat(String.valueOf(this.a.getString(13)));
                            case 4:
                                return "timestamp:".concat(String.valueOf(this.a.getString(9)));
                            case 5:
                                return "conversation_id:".concat(String.valueOf(this.a.getString(14)));
                            case 6:
                                return "sticker_set_id:".concat(String.valueOf(this.a.getString(15)));
                            default:
                                return "sticker_id:".concat(String.valueOf(this.a.getString(16)));
                        }
                    }
                });
                if (db(16)) {
                    if (z) {
                        String[] dm7 = dm(getString(cI(16, PartsTable.a)));
                        int length9 = dm7.length;
                        tqa[] tqaVarArr6 = new tqa[length9];
                        tqaVarArr2 = tqaVarArr;
                        for (int i35 = 0; i35 < length9; i35++) {
                            tqaVarArr6[i35] = wch.I(dm7[i35]);
                        }
                        tqaVarArr3 = (tqa[]) agnc.z(null, tqaVarArr6, new tqa[0]);
                    } else {
                        tqaVarArr2 = tqaVarArr;
                        tqaVarArr3 = new tqa[]{z()};
                    }
                } else {
                    tqaVarArr2 = tqaVarArr;
                    tqaVarArr3 = null;
                }
                final int i36 = 7;
                agmp.ds(length, tqaVarArr3, new alhr(this) { // from class: tbl
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i36) {
                            case 0:
                                return "width:".concat(String.valueOf(this.a.getString(7)));
                            case 1:
                                return "storage_uri:".concat(String.valueOf(this.a.getString(6)));
                            case 2:
                                return "height:".concat(String.valueOf(this.a.getString(8)));
                            case 3:
                                return "cms_attachment_processing_status:".concat(String.valueOf(this.a.getString(13)));
                            case 4:
                                return "timestamp:".concat(String.valueOf(this.a.getString(9)));
                            case 5:
                                return "conversation_id:".concat(String.valueOf(this.a.getString(14)));
                            case 6:
                                return "sticker_set_id:".concat(String.valueOf(this.a.getString(15)));
                            default:
                                return "sticker_id:".concat(String.valueOf(this.a.getString(16)));
                        }
                    }
                });
                if (db(17)) {
                    if (z) {
                        jArr5 = agnc.y(null, dl(getString(cI(17, PartsTable.a))));
                        i2 = 1;
                    } else {
                        i2 = 1;
                        jArr5 = new long[]{n()};
                    }
                } else {
                    i2 = 1;
                    jArr5 = null;
                }
                agmp.dr(length, jArr5, new tbm(this, i2));
                if (db(18)) {
                    if (z) {
                        dArr = agnc.C(di(getString(cI(18, PartsTable.a))));
                        jArr6 = jArr5;
                        i3 = 0;
                    } else {
                        dArr = new double[i2];
                        i3 = 0;
                        dArr[0] = e();
                        jArr6 = jArr5;
                    }
                } else {
                    i3 = 0;
                    jArr6 = jArr5;
                    dArr = null;
                }
                agmp.m44do(length, dArr, new tbm(this, i3));
                if (db(19)) {
                    if (z) {
                        dArr2 = agnc.C(di(getString(cI(19, PartsTable.a))));
                    } else {
                        dArr2 = new double[]{c()};
                    }
                } else {
                    dArr2 = null;
                }
                double[] dArr4 = dArr;
                agmp.m44do(length, dArr2, new tbj(this, 2));
                if (db(20)) {
                    if (z) {
                        String[] dm8 = dm(getString(cI(20, PartsTable.a)));
                        int length10 = dm8.length;
                        dArr3 = dArr2;
                        Uri[] uriArr15 = new Uri[length10];
                        tqaVarArr4 = tqaVarArr3;
                        int i37 = 0;
                        int i38 = 0;
                        while (i37 < length10) {
                            String str5 = dm8[i37];
                            int i39 = i38 + 1;
                            if (str5 != null && str5.length() != 0) {
                                uri = Uri.parse(str5);
                            } else {
                                uri = null;
                            }
                            uriArr15[i38] = uri;
                            i37++;
                            i38 = i39;
                        }
                        uriArr8 = (Uri[]) agnc.z(null, uriArr15, new Uri[0]);
                    } else {
                        tqaVarArr4 = tqaVarArr3;
                        dArr3 = dArr2;
                        uriArr8 = new Uri[]{s()};
                    }
                } else {
                    tqaVarArr4 = tqaVarArr3;
                    dArr3 = dArr2;
                    uriArr8 = null;
                }
                agmp.ds(length, uriArr8, new tbj(this, 4));
                if (db(21)) {
                    if (z) {
                        strArr4 = (String[]) agnc.z(null, dm(getString(cI(21, PartsTable.a))), new String[0]);
                    } else {
                        strArr4 = new String[]{S()};
                    }
                } else {
                    strArr4 = null;
                }
                agmp.ds(length, strArr4, new tbj(this, 5));
                if (db(22)) {
                    if (z) {
                        uriArr9 = ag();
                    } else {
                        uriArr9 = new Uri[]{q()};
                    }
                } else {
                    uriArr9 = null;
                }
                String[] strArr16 = strArr4;
                agmp.ds(length, uriArr9, new tbj(this, 6));
                if (db(23)) {
                    if (z) {
                        iArr4 = agnc.w(null, dk(getString(cI(23, PartsTable.a))));
                    } else {
                        iArr4 = new int[]{h()};
                    }
                } else {
                    iArr4 = null;
                }
                Uri[] uriArr16 = uriArr9;
                agmp.dq(length, iArr4, new tbj(this, 7));
                if (db(24)) {
                    if (z) {
                        iArr5 = ac();
                    } else {
                        iArr5 = new int[]{f()};
                    }
                } else {
                    iArr5 = null;
                }
                int[] iArr7 = iArr4;
                agmp.dq(length, iArr5, new tbj(this, 8));
                if (db(25)) {
                    if (z) {
                        strArr5 = al();
                    } else {
                        strArr5 = new String[]{J()};
                    }
                } else {
                    strArr5 = null;
                }
                int[] iArr8 = iArr5;
                agmp.ds(length, strArr5, new tbj(this, 9));
                if (db(26)) {
                    if (z) {
                        strArr6 = ak();
                    } else {
                        strArr6 = new String[]{I()};
                    }
                } else {
                    strArr6 = null;
                }
                String[] strArr17 = strArr5;
                agmp.ds(length, strArr6, new tbj(this, 10));
                if (db(27)) {
                    if (z) {
                        strArr7 = an();
                    } else {
                        strArr7 = new String[]{L()};
                    }
                } else {
                    strArr7 = null;
                }
                String[] strArr18 = strArr6;
                agmp.ds(length, strArr7, new tbj(this, 11));
                if (db(28)) {
                    if (z) {
                        bArr = aw();
                    } else {
                        bArr = new byte[][]{Z()};
                    }
                } else {
                    bArr = null;
                }
                String[] strArr19 = strArr7;
                agmp.ds(length, bArr, new tbj(this, 13));
                if (db(29)) {
                    if (z) {
                        bArr2 = av();
                    } else {
                        bArr2 = new byte[][]{Y()};
                    }
                } else {
                    bArr2 = null;
                }
                byte[][] bArr5 = bArr;
                agmp.ds(length, bArr2, new tbj(this, 14));
                if (db(30)) {
                    if (z) {
                        zArr = at();
                    } else {
                        zArr = new boolean[]{V()};
                    }
                } else {
                    zArr = null;
                }
                byte[][] bArr6 = bArr2;
                agmp.dt(length, zArr, new tbj(this, 16));
                if (db(31)) {
                    if (z) {
                        jArr7 = ad();
                    } else {
                        jArr7 = new long[]{j()};
                    }
                } else {
                    jArr7 = null;
                }
                boolean[] zArr5 = zArr;
                agmp.dr(length, jArr7, new tbj(this, 17));
                if (db(32)) {
                    if (z) {
                        strArr8 = aq();
                    } else {
                        strArr8 = new String[]{O()};
                    }
                } else {
                    strArr8 = null;
                }
                long[] jArr13 = jArr7;
                agmp.ds(length, strArr8, new tbj(this, 18));
                if (db(33)) {
                    if (z) {
                        strArr9 = ar();
                    } else {
                        strArr9 = new String[]{P()};
                    }
                } else {
                    strArr9 = null;
                }
                String[] strArr20 = strArr8;
                agmp.ds(length, strArr9, new tbj(this, 19));
                if (db(34)) {
                    if (z) {
                        jArr8 = af();
                    } else {
                        jArr8 = new long[]{l()};
                    }
                } else {
                    jArr8 = null;
                }
                String[] strArr21 = strArr9;
                agmp.dr(length, jArr8, new tbj(this, 20));
                if (db(35)) {
                    if (z) {
                        strArr10 = ao();
                        jArr9 = jArr8;
                        i4 = 1;
                    } else {
                        i4 = 1;
                        strArr10 = new String[]{M()};
                        jArr9 = jArr8;
                    }
                } else {
                    i4 = 1;
                    jArr9 = jArr8;
                    strArr10 = null;
                }
                agmp.ds(length, strArr10, new alhr(this) { // from class: tbk
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i4) {
                            case 0:
                                return "cms_compressed_blob_id:".concat(String.valueOf(this.a.getString(36)));
                            case 1:
                                return "compressed_blob_id:".concat(String.valueOf(this.a.getString(35)));
                            case 2:
                                return "target_size:".concat(String.valueOf(this.a.getString(11)));
                            case 3:
                                return "compressed_blob_upload_permanent_failure:".concat(String.valueOf(this.a.getString(37)));
                            case 4:
                                return "compressed_blob_upload_timestamp:".concat(String.valueOf(this.a.getString(38)));
                            case 5:
                                return "media_encryption_key:".concat(String.valueOf(this.a.getString(39)));
                            case 6:
                                return "uri:".concat(String.valueOf(this.a.getString(3)));
                            case 7:
                                return "compressed_media_encryption_key:".concat(String.valueOf(this.a.getString(40)));
                            case 8:
                                return "missing_entry_in_telephony:".concat(String.valueOf(this.a.getString(41)));
                            case 9:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(42)));
                            case 10:
                                return "file_size_bytes:".concat(String.valueOf(this.a.getString(43)));
                            case 11:
                                return "local_cache_path:".concat(String.valueOf(this.a.getString(44)));
                            case 12:
                                return "media_send_type:".concat(String.valueOf(this.a.getString(45)));
                            case 13:
                                return "processing_status:".concat(String.valueOf(this.a.getString(12)));
                            case 14:
                                return "voice_metadata:".concat(String.valueOf(this.a.getString(46)));
                            case 15:
                                return "validation_status:".concat(String.valueOf(this.a.getString(47)));
                            case 16:
                                return "processing_id:".concat(String.valueOf(this.a.getString(48)));
                            case 17:
                                return "rich_card_media_download_failure_reason:".concat(String.valueOf(this.a.getString(49)));
                            case 18:
                                return "content_type:".concat(String.valueOf(this.a.getString(4)));
                            case 19:
                                return "image_display_state:".concat(String.valueOf(this.a.getString(50)));
                            default:
                                return "original_uri:".concat(String.valueOf(this.a.getString(5)));
                        }
                    }
                });
                if (db(36)) {
                    if (z) {
                        strArr12 = am();
                        strArr11 = strArr10;
                        i5 = 0;
                    } else {
                        strArr12 = new String[i4];
                        strArr11 = strArr10;
                        i5 = 0;
                        strArr12[0] = K();
                    }
                } else {
                    strArr11 = strArr10;
                    i5 = 0;
                    strArr12 = null;
                }
                agmp.ds(length, strArr12, new alhr(this) { // from class: tbk
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i5) {
                            case 0:
                                return "cms_compressed_blob_id:".concat(String.valueOf(this.a.getString(36)));
                            case 1:
                                return "compressed_blob_id:".concat(String.valueOf(this.a.getString(35)));
                            case 2:
                                return "target_size:".concat(String.valueOf(this.a.getString(11)));
                            case 3:
                                return "compressed_blob_upload_permanent_failure:".concat(String.valueOf(this.a.getString(37)));
                            case 4:
                                return "compressed_blob_upload_timestamp:".concat(String.valueOf(this.a.getString(38)));
                            case 5:
                                return "media_encryption_key:".concat(String.valueOf(this.a.getString(39)));
                            case 6:
                                return "uri:".concat(String.valueOf(this.a.getString(3)));
                            case 7:
                                return "compressed_media_encryption_key:".concat(String.valueOf(this.a.getString(40)));
                            case 8:
                                return "missing_entry_in_telephony:".concat(String.valueOf(this.a.getString(41)));
                            case 9:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(42)));
                            case 10:
                                return "file_size_bytes:".concat(String.valueOf(this.a.getString(43)));
                            case 11:
                                return "local_cache_path:".concat(String.valueOf(this.a.getString(44)));
                            case 12:
                                return "media_send_type:".concat(String.valueOf(this.a.getString(45)));
                            case 13:
                                return "processing_status:".concat(String.valueOf(this.a.getString(12)));
                            case 14:
                                return "voice_metadata:".concat(String.valueOf(this.a.getString(46)));
                            case 15:
                                return "validation_status:".concat(String.valueOf(this.a.getString(47)));
                            case 16:
                                return "processing_id:".concat(String.valueOf(this.a.getString(48)));
                            case 17:
                                return "rich_card_media_download_failure_reason:".concat(String.valueOf(this.a.getString(49)));
                            case 18:
                                return "content_type:".concat(String.valueOf(this.a.getString(4)));
                            case 19:
                                return "image_display_state:".concat(String.valueOf(this.a.getString(50)));
                            default:
                                return "original_uri:".concat(String.valueOf(this.a.getString(5)));
                        }
                    }
                });
                if (db(37)) {
                    if (z) {
                        strArr13 = strArr12;
                        zArr2 = au();
                    } else {
                        strArr13 = strArr12;
                        zArr2 = new boolean[1];
                        zArr2[i5] = W();
                    }
                } else {
                    strArr13 = strArr12;
                    zArr2 = null;
                }
                final int i40 = 3;
                agmp.dt(length, zArr2, new alhr(this) { // from class: tbk
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i40) {
                            case 0:
                                return "cms_compressed_blob_id:".concat(String.valueOf(this.a.getString(36)));
                            case 1:
                                return "compressed_blob_id:".concat(String.valueOf(this.a.getString(35)));
                            case 2:
                                return "target_size:".concat(String.valueOf(this.a.getString(11)));
                            case 3:
                                return "compressed_blob_upload_permanent_failure:".concat(String.valueOf(this.a.getString(37)));
                            case 4:
                                return "compressed_blob_upload_timestamp:".concat(String.valueOf(this.a.getString(38)));
                            case 5:
                                return "media_encryption_key:".concat(String.valueOf(this.a.getString(39)));
                            case 6:
                                return "uri:".concat(String.valueOf(this.a.getString(3)));
                            case 7:
                                return "compressed_media_encryption_key:".concat(String.valueOf(this.a.getString(40)));
                            case 8:
                                return "missing_entry_in_telephony:".concat(String.valueOf(this.a.getString(41)));
                            case 9:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(42)));
                            case 10:
                                return "file_size_bytes:".concat(String.valueOf(this.a.getString(43)));
                            case 11:
                                return "local_cache_path:".concat(String.valueOf(this.a.getString(44)));
                            case 12:
                                return "media_send_type:".concat(String.valueOf(this.a.getString(45)));
                            case 13:
                                return "processing_status:".concat(String.valueOf(this.a.getString(12)));
                            case 14:
                                return "voice_metadata:".concat(String.valueOf(this.a.getString(46)));
                            case 15:
                                return "validation_status:".concat(String.valueOf(this.a.getString(47)));
                            case 16:
                                return "processing_id:".concat(String.valueOf(this.a.getString(48)));
                            case 17:
                                return "rich_card_media_download_failure_reason:".concat(String.valueOf(this.a.getString(49)));
                            case 18:
                                return "content_type:".concat(String.valueOf(this.a.getString(4)));
                            case 19:
                                return "image_display_state:".concat(String.valueOf(this.a.getString(50)));
                            default:
                                return "original_uri:".concat(String.valueOf(this.a.getString(5)));
                        }
                    }
                });
                if (db(38)) {
                    if (z) {
                        jArr10 = ae();
                    } else {
                        jArr10 = new long[]{k()};
                    }
                } else {
                    jArr10 = null;
                }
                boolean[] zArr6 = zArr2;
                final int i41 = 4;
                agmp.dr(length, jArr10, new alhr(this) { // from class: tbk
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i41) {
                            case 0:
                                return "cms_compressed_blob_id:".concat(String.valueOf(this.a.getString(36)));
                            case 1:
                                return "compressed_blob_id:".concat(String.valueOf(this.a.getString(35)));
                            case 2:
                                return "target_size:".concat(String.valueOf(this.a.getString(11)));
                            case 3:
                                return "compressed_blob_upload_permanent_failure:".concat(String.valueOf(this.a.getString(37)));
                            case 4:
                                return "compressed_blob_upload_timestamp:".concat(String.valueOf(this.a.getString(38)));
                            case 5:
                                return "media_encryption_key:".concat(String.valueOf(this.a.getString(39)));
                            case 6:
                                return "uri:".concat(String.valueOf(this.a.getString(3)));
                            case 7:
                                return "compressed_media_encryption_key:".concat(String.valueOf(this.a.getString(40)));
                            case 8:
                                return "missing_entry_in_telephony:".concat(String.valueOf(this.a.getString(41)));
                            case 9:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(42)));
                            case 10:
                                return "file_size_bytes:".concat(String.valueOf(this.a.getString(43)));
                            case 11:
                                return "local_cache_path:".concat(String.valueOf(this.a.getString(44)));
                            case 12:
                                return "media_send_type:".concat(String.valueOf(this.a.getString(45)));
                            case 13:
                                return "processing_status:".concat(String.valueOf(this.a.getString(12)));
                            case 14:
                                return "voice_metadata:".concat(String.valueOf(this.a.getString(46)));
                            case 15:
                                return "validation_status:".concat(String.valueOf(this.a.getString(47)));
                            case 16:
                                return "processing_id:".concat(String.valueOf(this.a.getString(48)));
                            case 17:
                                return "rich_card_media_download_failure_reason:".concat(String.valueOf(this.a.getString(49)));
                            case 18:
                                return "content_type:".concat(String.valueOf(this.a.getString(4)));
                            case 19:
                                return "image_display_state:".concat(String.valueOf(this.a.getString(50)));
                            default:
                                return "original_uri:".concat(String.valueOf(this.a.getString(5)));
                        }
                    }
                });
                if (db(39)) {
                    if (z) {
                        bArr3 = agnc.B(null, dv(getString(cI(39, PartsTable.a))));
                    } else {
                        bArr3 = new byte[][]{ab()};
                    }
                } else {
                    bArr3 = null;
                }
                long[] jArr14 = jArr10;
                final int i42 = 5;
                agmp.ds(length, bArr3, new alhr(this) { // from class: tbk
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i42) {
                            case 0:
                                return "cms_compressed_blob_id:".concat(String.valueOf(this.a.getString(36)));
                            case 1:
                                return "compressed_blob_id:".concat(String.valueOf(this.a.getString(35)));
                            case 2:
                                return "target_size:".concat(String.valueOf(this.a.getString(11)));
                            case 3:
                                return "compressed_blob_upload_permanent_failure:".concat(String.valueOf(this.a.getString(37)));
                            case 4:
                                return "compressed_blob_upload_timestamp:".concat(String.valueOf(this.a.getString(38)));
                            case 5:
                                return "media_encryption_key:".concat(String.valueOf(this.a.getString(39)));
                            case 6:
                                return "uri:".concat(String.valueOf(this.a.getString(3)));
                            case 7:
                                return "compressed_media_encryption_key:".concat(String.valueOf(this.a.getString(40)));
                            case 8:
                                return "missing_entry_in_telephony:".concat(String.valueOf(this.a.getString(41)));
                            case 9:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(42)));
                            case 10:
                                return "file_size_bytes:".concat(String.valueOf(this.a.getString(43)));
                            case 11:
                                return "local_cache_path:".concat(String.valueOf(this.a.getString(44)));
                            case 12:
                                return "media_send_type:".concat(String.valueOf(this.a.getString(45)));
                            case 13:
                                return "processing_status:".concat(String.valueOf(this.a.getString(12)));
                            case 14:
                                return "voice_metadata:".concat(String.valueOf(this.a.getString(46)));
                            case 15:
                                return "validation_status:".concat(String.valueOf(this.a.getString(47)));
                            case 16:
                                return "processing_id:".concat(String.valueOf(this.a.getString(48)));
                            case 17:
                                return "rich_card_media_download_failure_reason:".concat(String.valueOf(this.a.getString(49)));
                            case 18:
                                return "content_type:".concat(String.valueOf(this.a.getString(4)));
                            case 19:
                                return "image_display_state:".concat(String.valueOf(this.a.getString(50)));
                            default:
                                return "original_uri:".concat(String.valueOf(this.a.getString(5)));
                        }
                    }
                });
                if (db(40)) {
                    if (z) {
                        bArr4 = ax();
                    } else {
                        bArr4 = new byte[][]{aa()};
                    }
                } else {
                    bArr4 = null;
                }
                byte[][] bArr7 = bArr3;
                final int i43 = 7;
                agmp.ds(length, bArr4, new alhr(this) { // from class: tbk
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i43) {
                            case 0:
                                return "cms_compressed_blob_id:".concat(String.valueOf(this.a.getString(36)));
                            case 1:
                                return "compressed_blob_id:".concat(String.valueOf(this.a.getString(35)));
                            case 2:
                                return "target_size:".concat(String.valueOf(this.a.getString(11)));
                            case 3:
                                return "compressed_blob_upload_permanent_failure:".concat(String.valueOf(this.a.getString(37)));
                            case 4:
                                return "compressed_blob_upload_timestamp:".concat(String.valueOf(this.a.getString(38)));
                            case 5:
                                return "media_encryption_key:".concat(String.valueOf(this.a.getString(39)));
                            case 6:
                                return "uri:".concat(String.valueOf(this.a.getString(3)));
                            case 7:
                                return "compressed_media_encryption_key:".concat(String.valueOf(this.a.getString(40)));
                            case 8:
                                return "missing_entry_in_telephony:".concat(String.valueOf(this.a.getString(41)));
                            case 9:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(42)));
                            case 10:
                                return "file_size_bytes:".concat(String.valueOf(this.a.getString(43)));
                            case 11:
                                return "local_cache_path:".concat(String.valueOf(this.a.getString(44)));
                            case 12:
                                return "media_send_type:".concat(String.valueOf(this.a.getString(45)));
                            case 13:
                                return "processing_status:".concat(String.valueOf(this.a.getString(12)));
                            case 14:
                                return "voice_metadata:".concat(String.valueOf(this.a.getString(46)));
                            case 15:
                                return "validation_status:".concat(String.valueOf(this.a.getString(47)));
                            case 16:
                                return "processing_id:".concat(String.valueOf(this.a.getString(48)));
                            case 17:
                                return "rich_card_media_download_failure_reason:".concat(String.valueOf(this.a.getString(49)));
                            case 18:
                                return "content_type:".concat(String.valueOf(this.a.getString(4)));
                            case 19:
                                return "image_display_state:".concat(String.valueOf(this.a.getString(50)));
                            default:
                                return "original_uri:".concat(String.valueOf(this.a.getString(5)));
                        }
                    }
                });
                if (db(41)) {
                    if (z) {
                        zArr3 = agnc.A(null, dn(getString(cI(41, PartsTable.a))));
                    } else {
                        zArr3 = new boolean[]{X()};
                    }
                } else {
                    zArr3 = null;
                }
                byte[][] bArr8 = bArr4;
                final int i44 = 8;
                agmp.dt(length, zArr3, new alhr(this) { // from class: tbk
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i44) {
                            case 0:
                                return "cms_compressed_blob_id:".concat(String.valueOf(this.a.getString(36)));
                            case 1:
                                return "compressed_blob_id:".concat(String.valueOf(this.a.getString(35)));
                            case 2:
                                return "target_size:".concat(String.valueOf(this.a.getString(11)));
                            case 3:
                                return "compressed_blob_upload_permanent_failure:".concat(String.valueOf(this.a.getString(37)));
                            case 4:
                                return "compressed_blob_upload_timestamp:".concat(String.valueOf(this.a.getString(38)));
                            case 5:
                                return "media_encryption_key:".concat(String.valueOf(this.a.getString(39)));
                            case 6:
                                return "uri:".concat(String.valueOf(this.a.getString(3)));
                            case 7:
                                return "compressed_media_encryption_key:".concat(String.valueOf(this.a.getString(40)));
                            case 8:
                                return "missing_entry_in_telephony:".concat(String.valueOf(this.a.getString(41)));
                            case 9:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(42)));
                            case 10:
                                return "file_size_bytes:".concat(String.valueOf(this.a.getString(43)));
                            case 11:
                                return "local_cache_path:".concat(String.valueOf(this.a.getString(44)));
                            case 12:
                                return "media_send_type:".concat(String.valueOf(this.a.getString(45)));
                            case 13:
                                return "processing_status:".concat(String.valueOf(this.a.getString(12)));
                            case 14:
                                return "voice_metadata:".concat(String.valueOf(this.a.getString(46)));
                            case 15:
                                return "validation_status:".concat(String.valueOf(this.a.getString(47)));
                            case 16:
                                return "processing_id:".concat(String.valueOf(this.a.getString(48)));
                            case 17:
                                return "rich_card_media_download_failure_reason:".concat(String.valueOf(this.a.getString(49)));
                            case 18:
                                return "content_type:".concat(String.valueOf(this.a.getString(4)));
                            case 19:
                                return "image_display_state:".concat(String.valueOf(this.a.getString(50)));
                            default:
                                return "original_uri:".concat(String.valueOf(this.a.getString(5)));
                        }
                    }
                });
                if (db(42)) {
                    if (z) {
                        zArr4 = as();
                    } else {
                        zArr4 = new boolean[]{U()};
                    }
                } else {
                    zArr4 = null;
                }
                boolean[] zArr7 = zArr3;
                final int i45 = 9;
                agmp.dt(length, zArr4, new alhr(this) { // from class: tbk
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i45) {
                            case 0:
                                return "cms_compressed_blob_id:".concat(String.valueOf(this.a.getString(36)));
                            case 1:
                                return "compressed_blob_id:".concat(String.valueOf(this.a.getString(35)));
                            case 2:
                                return "target_size:".concat(String.valueOf(this.a.getString(11)));
                            case 3:
                                return "compressed_blob_upload_permanent_failure:".concat(String.valueOf(this.a.getString(37)));
                            case 4:
                                return "compressed_blob_upload_timestamp:".concat(String.valueOf(this.a.getString(38)));
                            case 5:
                                return "media_encryption_key:".concat(String.valueOf(this.a.getString(39)));
                            case 6:
                                return "uri:".concat(String.valueOf(this.a.getString(3)));
                            case 7:
                                return "compressed_media_encryption_key:".concat(String.valueOf(this.a.getString(40)));
                            case 8:
                                return "missing_entry_in_telephony:".concat(String.valueOf(this.a.getString(41)));
                            case 9:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(42)));
                            case 10:
                                return "file_size_bytes:".concat(String.valueOf(this.a.getString(43)));
                            case 11:
                                return "local_cache_path:".concat(String.valueOf(this.a.getString(44)));
                            case 12:
                                return "media_send_type:".concat(String.valueOf(this.a.getString(45)));
                            case 13:
                                return "processing_status:".concat(String.valueOf(this.a.getString(12)));
                            case 14:
                                return "voice_metadata:".concat(String.valueOf(this.a.getString(46)));
                            case 15:
                                return "validation_status:".concat(String.valueOf(this.a.getString(47)));
                            case 16:
                                return "processing_id:".concat(String.valueOf(this.a.getString(48)));
                            case 17:
                                return "rich_card_media_download_failure_reason:".concat(String.valueOf(this.a.getString(49)));
                            case 18:
                                return "content_type:".concat(String.valueOf(this.a.getString(4)));
                            case 19:
                                return "image_display_state:".concat(String.valueOf(this.a.getString(50)));
                            default:
                                return "original_uri:".concat(String.valueOf(this.a.getString(5)));
                        }
                    }
                });
                if (db(43)) {
                    if (z) {
                        jArr11 = agnc.y(null, dl(getString(cI(43, PartsTable.a))));
                    } else {
                        jArr11 = new long[]{m()};
                    }
                } else {
                    jArr11 = null;
                }
                boolean[] zArr8 = zArr4;
                final int i46 = 10;
                agmp.dr(length, jArr11, new alhr(this) { // from class: tbk
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i46) {
                            case 0:
                                return "cms_compressed_blob_id:".concat(String.valueOf(this.a.getString(36)));
                            case 1:
                                return "compressed_blob_id:".concat(String.valueOf(this.a.getString(35)));
                            case 2:
                                return "target_size:".concat(String.valueOf(this.a.getString(11)));
                            case 3:
                                return "compressed_blob_upload_permanent_failure:".concat(String.valueOf(this.a.getString(37)));
                            case 4:
                                return "compressed_blob_upload_timestamp:".concat(String.valueOf(this.a.getString(38)));
                            case 5:
                                return "media_encryption_key:".concat(String.valueOf(this.a.getString(39)));
                            case 6:
                                return "uri:".concat(String.valueOf(this.a.getString(3)));
                            case 7:
                                return "compressed_media_encryption_key:".concat(String.valueOf(this.a.getString(40)));
                            case 8:
                                return "missing_entry_in_telephony:".concat(String.valueOf(this.a.getString(41)));
                            case 9:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(42)));
                            case 10:
                                return "file_size_bytes:".concat(String.valueOf(this.a.getString(43)));
                            case 11:
                                return "local_cache_path:".concat(String.valueOf(this.a.getString(44)));
                            case 12:
                                return "media_send_type:".concat(String.valueOf(this.a.getString(45)));
                            case 13:
                                return "processing_status:".concat(String.valueOf(this.a.getString(12)));
                            case 14:
                                return "voice_metadata:".concat(String.valueOf(this.a.getString(46)));
                            case 15:
                                return "validation_status:".concat(String.valueOf(this.a.getString(47)));
                            case 16:
                                return "processing_id:".concat(String.valueOf(this.a.getString(48)));
                            case 17:
                                return "rich_card_media_download_failure_reason:".concat(String.valueOf(this.a.getString(49)));
                            case 18:
                                return "content_type:".concat(String.valueOf(this.a.getString(4)));
                            case 19:
                                return "image_display_state:".concat(String.valueOf(this.a.getString(50)));
                            default:
                                return "original_uri:".concat(String.valueOf(this.a.getString(5)));
                        }
                    }
                });
                if (db(44)) {
                    if (z) {
                        jArr12 = jArr11;
                        strArr14 = (String[]) agnc.z(null, dm(getString(cI(44, PartsTable.a))), new String[0]);
                    } else {
                        jArr12 = jArr11;
                        strArr14 = new String[]{R()};
                    }
                } else {
                    jArr12 = jArr11;
                    strArr14 = null;
                }
                final int i47 = 11;
                agmp.ds(length, strArr14, new alhr(this) { // from class: tbk
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i47) {
                            case 0:
                                return "cms_compressed_blob_id:".concat(String.valueOf(this.a.getString(36)));
                            case 1:
                                return "compressed_blob_id:".concat(String.valueOf(this.a.getString(35)));
                            case 2:
                                return "target_size:".concat(String.valueOf(this.a.getString(11)));
                            case 3:
                                return "compressed_blob_upload_permanent_failure:".concat(String.valueOf(this.a.getString(37)));
                            case 4:
                                return "compressed_blob_upload_timestamp:".concat(String.valueOf(this.a.getString(38)));
                            case 5:
                                return "media_encryption_key:".concat(String.valueOf(this.a.getString(39)));
                            case 6:
                                return "uri:".concat(String.valueOf(this.a.getString(3)));
                            case 7:
                                return "compressed_media_encryption_key:".concat(String.valueOf(this.a.getString(40)));
                            case 8:
                                return "missing_entry_in_telephony:".concat(String.valueOf(this.a.getString(41)));
                            case 9:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(42)));
                            case 10:
                                return "file_size_bytes:".concat(String.valueOf(this.a.getString(43)));
                            case 11:
                                return "local_cache_path:".concat(String.valueOf(this.a.getString(44)));
                            case 12:
                                return "media_send_type:".concat(String.valueOf(this.a.getString(45)));
                            case 13:
                                return "processing_status:".concat(String.valueOf(this.a.getString(12)));
                            case 14:
                                return "voice_metadata:".concat(String.valueOf(this.a.getString(46)));
                            case 15:
                                return "validation_status:".concat(String.valueOf(this.a.getString(47)));
                            case 16:
                                return "processing_id:".concat(String.valueOf(this.a.getString(48)));
                            case 17:
                                return "rich_card_media_download_failure_reason:".concat(String.valueOf(this.a.getString(49)));
                            case 18:
                                return "content_type:".concat(String.valueOf(this.a.getString(4)));
                            case 19:
                                return "image_display_state:".concat(String.valueOf(this.a.getString(50)));
                            default:
                                return "original_uri:".concat(String.valueOf(this.a.getString(5)));
                        }
                    }
                });
                if (db(45)) {
                    if (z) {
                        int[] dk2 = dk(getString(cI(45, PartsTable.a)));
                        tqj[] values2 = tqj.values();
                        strArr15 = strArr14;
                        int length11 = values2.length;
                        uriArr10 = uriArr8;
                        tqj[] tqjVarArr3 = new tqj[dk2.length];
                        tqdVarArr2 = tqdVarArr;
                        tqlVarArr2 = tqlVarArr;
                        for (int i48 = 0; i48 < dk2.length; i48++) {
                            int i49 = dk2[i48];
                            if (i49 < length11) {
                                tqjVarArr3[i48] = values2[i49];
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        tqjVarArr = (tqj[]) agnc.z(null, tqjVarArr3, new tqj[0]);
                    } else {
                        tqdVarArr2 = tqdVarArr;
                        uriArr10 = uriArr8;
                        strArr15 = strArr14;
                        tqlVarArr2 = tqlVarArr;
                        tqjVarArr = new tqj[]{D()};
                    }
                } else {
                    tqdVarArr2 = tqdVarArr;
                    uriArr10 = uriArr8;
                    strArr15 = strArr14;
                    tqlVarArr2 = tqlVarArr;
                    tqjVarArr = null;
                }
                final int i50 = 12;
                agmp.ds(length, tqjVarArr, new alhr(this) { // from class: tbk
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i50) {
                            case 0:
                                return "cms_compressed_blob_id:".concat(String.valueOf(this.a.getString(36)));
                            case 1:
                                return "compressed_blob_id:".concat(String.valueOf(this.a.getString(35)));
                            case 2:
                                return "target_size:".concat(String.valueOf(this.a.getString(11)));
                            case 3:
                                return "compressed_blob_upload_permanent_failure:".concat(String.valueOf(this.a.getString(37)));
                            case 4:
                                return "compressed_blob_upload_timestamp:".concat(String.valueOf(this.a.getString(38)));
                            case 5:
                                return "media_encryption_key:".concat(String.valueOf(this.a.getString(39)));
                            case 6:
                                return "uri:".concat(String.valueOf(this.a.getString(3)));
                            case 7:
                                return "compressed_media_encryption_key:".concat(String.valueOf(this.a.getString(40)));
                            case 8:
                                return "missing_entry_in_telephony:".concat(String.valueOf(this.a.getString(41)));
                            case 9:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(42)));
                            case 10:
                                return "file_size_bytes:".concat(String.valueOf(this.a.getString(43)));
                            case 11:
                                return "local_cache_path:".concat(String.valueOf(this.a.getString(44)));
                            case 12:
                                return "media_send_type:".concat(String.valueOf(this.a.getString(45)));
                            case 13:
                                return "processing_status:".concat(String.valueOf(this.a.getString(12)));
                            case 14:
                                return "voice_metadata:".concat(String.valueOf(this.a.getString(46)));
                            case 15:
                                return "validation_status:".concat(String.valueOf(this.a.getString(47)));
                            case 16:
                                return "processing_id:".concat(String.valueOf(this.a.getString(48)));
                            case 17:
                                return "rich_card_media_download_failure_reason:".concat(String.valueOf(this.a.getString(49)));
                            case 18:
                                return "content_type:".concat(String.valueOf(this.a.getString(4)));
                            case 19:
                                return "image_display_state:".concat(String.valueOf(this.a.getString(50)));
                            default:
                                return "original_uri:".concat(String.valueOf(this.a.getString(5)));
                        }
                    }
                });
                if (db(46)) {
                    if (z) {
                        List cY = cY(getString(cI(46, PartsTable.a)));
                        aggp[] aggpVarArr3 = new aggp[cY.size()];
                        Iterator it2 = cY.iterator();
                        int i51 = 0;
                        while (it2.hasNext()) {
                            try {
                                byte[] v = agnc.v((String) it2.next());
                                int i52 = i51 + 1;
                                if (v == null) {
                                    it = it2;
                                    aggpVar = null;
                                } else {
                                    it = it2;
                                    try {
                                        aggpVar = (aggp) apag.parseFrom(aggp.a, v);
                                    } catch (Throwable unused) {
                                        i51 = i52;
                                        aggpVarArr3[i51] = null;
                                        i51++;
                                        it2 = it;
                                    }
                                }
                                aggpVarArr3[i51] = aggpVar;
                                i51 = i52;
                            } catch (Throwable unused2) {
                                it = it2;
                            }
                            it2 = it;
                        }
                        aggpVarArr = (aggp[]) agnc.z(null, aggpVarArr3, new aggp[0]);
                    } else {
                        aggpVarArr = new aggp[]{H()};
                    }
                } else {
                    aggpVarArr = null;
                }
                final int i53 = 14;
                agmp.ds(length, aggpVarArr, new alhr(this) { // from class: tbk
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i53) {
                            case 0:
                                return "cms_compressed_blob_id:".concat(String.valueOf(this.a.getString(36)));
                            case 1:
                                return "compressed_blob_id:".concat(String.valueOf(this.a.getString(35)));
                            case 2:
                                return "target_size:".concat(String.valueOf(this.a.getString(11)));
                            case 3:
                                return "compressed_blob_upload_permanent_failure:".concat(String.valueOf(this.a.getString(37)));
                            case 4:
                                return "compressed_blob_upload_timestamp:".concat(String.valueOf(this.a.getString(38)));
                            case 5:
                                return "media_encryption_key:".concat(String.valueOf(this.a.getString(39)));
                            case 6:
                                return "uri:".concat(String.valueOf(this.a.getString(3)));
                            case 7:
                                return "compressed_media_encryption_key:".concat(String.valueOf(this.a.getString(40)));
                            case 8:
                                return "missing_entry_in_telephony:".concat(String.valueOf(this.a.getString(41)));
                            case 9:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(42)));
                            case 10:
                                return "file_size_bytes:".concat(String.valueOf(this.a.getString(43)));
                            case 11:
                                return "local_cache_path:".concat(String.valueOf(this.a.getString(44)));
                            case 12:
                                return "media_send_type:".concat(String.valueOf(this.a.getString(45)));
                            case 13:
                                return "processing_status:".concat(String.valueOf(this.a.getString(12)));
                            case 14:
                                return "voice_metadata:".concat(String.valueOf(this.a.getString(46)));
                            case 15:
                                return "validation_status:".concat(String.valueOf(this.a.getString(47)));
                            case 16:
                                return "processing_id:".concat(String.valueOf(this.a.getString(48)));
                            case 17:
                                return "rich_card_media_download_failure_reason:".concat(String.valueOf(this.a.getString(49)));
                            case 18:
                                return "content_type:".concat(String.valueOf(this.a.getString(4)));
                            case 19:
                                return "image_display_state:".concat(String.valueOf(this.a.getString(50)));
                            default:
                                return "original_uri:".concat(String.valueOf(this.a.getString(5)));
                        }
                    }
                });
                if (db(47)) {
                    if (z) {
                        int[] dk3 = dk(getString(cI(47, PartsTable.a)));
                        tqw[] values3 = tqw.values();
                        int length12 = values3.length;
                        tqw[] tqwVarArr3 = new tqw[dk3.length];
                        aggpVarArr2 = aggpVarArr;
                        tqjVarArr2 = tqjVarArr;
                        for (int i54 = 0; i54 < dk3.length; i54++) {
                            int i55 = dk3[i54];
                            if (i55 < length12) {
                                tqwVarArr3[i54] = values3[i55];
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        tqwVarArr = (tqw[]) agnc.z(null, tqwVarArr3, new tqw[0]);
                    } else {
                        aggpVarArr2 = aggpVarArr;
                        tqjVarArr2 = tqjVarArr;
                        tqwVarArr = new tqw[]{G()};
                    }
                } else {
                    aggpVarArr2 = aggpVarArr;
                    tqjVarArr2 = tqjVarArr;
                    tqwVarArr = null;
                }
                final int i56 = 15;
                agmp.ds(length, tqwVarArr, new alhr(this) { // from class: tbk
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i56) {
                            case 0:
                                return "cms_compressed_blob_id:".concat(String.valueOf(this.a.getString(36)));
                            case 1:
                                return "compressed_blob_id:".concat(String.valueOf(this.a.getString(35)));
                            case 2:
                                return "target_size:".concat(String.valueOf(this.a.getString(11)));
                            case 3:
                                return "compressed_blob_upload_permanent_failure:".concat(String.valueOf(this.a.getString(37)));
                            case 4:
                                return "compressed_blob_upload_timestamp:".concat(String.valueOf(this.a.getString(38)));
                            case 5:
                                return "media_encryption_key:".concat(String.valueOf(this.a.getString(39)));
                            case 6:
                                return "uri:".concat(String.valueOf(this.a.getString(3)));
                            case 7:
                                return "compressed_media_encryption_key:".concat(String.valueOf(this.a.getString(40)));
                            case 8:
                                return "missing_entry_in_telephony:".concat(String.valueOf(this.a.getString(41)));
                            case 9:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(42)));
                            case 10:
                                return "file_size_bytes:".concat(String.valueOf(this.a.getString(43)));
                            case 11:
                                return "local_cache_path:".concat(String.valueOf(this.a.getString(44)));
                            case 12:
                                return "media_send_type:".concat(String.valueOf(this.a.getString(45)));
                            case 13:
                                return "processing_status:".concat(String.valueOf(this.a.getString(12)));
                            case 14:
                                return "voice_metadata:".concat(String.valueOf(this.a.getString(46)));
                            case 15:
                                return "validation_status:".concat(String.valueOf(this.a.getString(47)));
                            case 16:
                                return "processing_id:".concat(String.valueOf(this.a.getString(48)));
                            case 17:
                                return "rich_card_media_download_failure_reason:".concat(String.valueOf(this.a.getString(49)));
                            case 18:
                                return "content_type:".concat(String.valueOf(this.a.getString(4)));
                            case 19:
                                return "image_display_state:".concat(String.valueOf(this.a.getString(50)));
                            default:
                                return "original_uri:".concat(String.valueOf(this.a.getString(5)));
                        }
                    }
                });
                if (db(48)) {
                    if (z) {
                        String[] dm9 = dm(getString(cI(48, PartsTable.a)));
                        int length13 = dm9.length;
                        pyz[] pyzVarArr3 = new pyz[length13];
                        for (int i57 = 0; i57 < length13; i57++) {
                            pyzVarArr3[i57] = pzm.a(dm9[i57]);
                        }
                        pyzVarArr = (pyz[]) agnc.z(null, pyzVarArr3, new pyz[0]);
                    } else {
                        pyzVarArr = new pyz[]{w()};
                    }
                } else {
                    pyzVarArr = null;
                }
                final int i58 = 16;
                agmp.ds(length, pyzVarArr, new alhr(this) { // from class: tbk
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i58) {
                            case 0:
                                return "cms_compressed_blob_id:".concat(String.valueOf(this.a.getString(36)));
                            case 1:
                                return "compressed_blob_id:".concat(String.valueOf(this.a.getString(35)));
                            case 2:
                                return "target_size:".concat(String.valueOf(this.a.getString(11)));
                            case 3:
                                return "compressed_blob_upload_permanent_failure:".concat(String.valueOf(this.a.getString(37)));
                            case 4:
                                return "compressed_blob_upload_timestamp:".concat(String.valueOf(this.a.getString(38)));
                            case 5:
                                return "media_encryption_key:".concat(String.valueOf(this.a.getString(39)));
                            case 6:
                                return "uri:".concat(String.valueOf(this.a.getString(3)));
                            case 7:
                                return "compressed_media_encryption_key:".concat(String.valueOf(this.a.getString(40)));
                            case 8:
                                return "missing_entry_in_telephony:".concat(String.valueOf(this.a.getString(41)));
                            case 9:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(42)));
                            case 10:
                                return "file_size_bytes:".concat(String.valueOf(this.a.getString(43)));
                            case 11:
                                return "local_cache_path:".concat(String.valueOf(this.a.getString(44)));
                            case 12:
                                return "media_send_type:".concat(String.valueOf(this.a.getString(45)));
                            case 13:
                                return "processing_status:".concat(String.valueOf(this.a.getString(12)));
                            case 14:
                                return "voice_metadata:".concat(String.valueOf(this.a.getString(46)));
                            case 15:
                                return "validation_status:".concat(String.valueOf(this.a.getString(47)));
                            case 16:
                                return "processing_id:".concat(String.valueOf(this.a.getString(48)));
                            case 17:
                                return "rich_card_media_download_failure_reason:".concat(String.valueOf(this.a.getString(49)));
                            case 18:
                                return "content_type:".concat(String.valueOf(this.a.getString(4)));
                            case 19:
                                return "image_display_state:".concat(String.valueOf(this.a.getString(50)));
                            default:
                                return "original_uri:".concat(String.valueOf(this.a.getString(5)));
                        }
                    }
                });
                if (db(49)) {
                    if (z) {
                        int[] dk4 = dk(getString(cI(49, PartsTable.a)));
                        tqq[] values4 = tqq.values();
                        int length14 = values4.length;
                        tqq[] tqqVarArr2 = new tqq[dk4.length];
                        pyzVarArr2 = pyzVarArr;
                        tqwVarArr2 = tqwVarArr;
                        for (int i59 = 0; i59 < dk4.length; i59++) {
                            int i60 = dk4[i59];
                            if (i60 < length14) {
                                tqqVarArr2[i59] = values4[i60];
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        tqiVarArr = null;
                        tqqVarArr = (tqq[]) agnc.z(null, tqqVarArr2, new tqq[0]);
                    } else {
                        pyzVarArr2 = pyzVarArr;
                        tqwVarArr2 = tqwVarArr;
                        tqiVarArr = null;
                        tqqVarArr = new tqq[]{F()};
                    }
                } else {
                    pyzVarArr2 = pyzVarArr;
                    tqwVarArr2 = tqwVarArr;
                    tqiVarArr = null;
                    tqqVarArr = null;
                }
                final int i61 = 17;
                agmp.ds(length, tqqVarArr, new alhr(this) { // from class: tbk
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i61) {
                            case 0:
                                return "cms_compressed_blob_id:".concat(String.valueOf(this.a.getString(36)));
                            case 1:
                                return "compressed_blob_id:".concat(String.valueOf(this.a.getString(35)));
                            case 2:
                                return "target_size:".concat(String.valueOf(this.a.getString(11)));
                            case 3:
                                return "compressed_blob_upload_permanent_failure:".concat(String.valueOf(this.a.getString(37)));
                            case 4:
                                return "compressed_blob_upload_timestamp:".concat(String.valueOf(this.a.getString(38)));
                            case 5:
                                return "media_encryption_key:".concat(String.valueOf(this.a.getString(39)));
                            case 6:
                                return "uri:".concat(String.valueOf(this.a.getString(3)));
                            case 7:
                                return "compressed_media_encryption_key:".concat(String.valueOf(this.a.getString(40)));
                            case 8:
                                return "missing_entry_in_telephony:".concat(String.valueOf(this.a.getString(41)));
                            case 9:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(42)));
                            case 10:
                                return "file_size_bytes:".concat(String.valueOf(this.a.getString(43)));
                            case 11:
                                return "local_cache_path:".concat(String.valueOf(this.a.getString(44)));
                            case 12:
                                return "media_send_type:".concat(String.valueOf(this.a.getString(45)));
                            case 13:
                                return "processing_status:".concat(String.valueOf(this.a.getString(12)));
                            case 14:
                                return "voice_metadata:".concat(String.valueOf(this.a.getString(46)));
                            case 15:
                                return "validation_status:".concat(String.valueOf(this.a.getString(47)));
                            case 16:
                                return "processing_id:".concat(String.valueOf(this.a.getString(48)));
                            case 17:
                                return "rich_card_media_download_failure_reason:".concat(String.valueOf(this.a.getString(49)));
                            case 18:
                                return "content_type:".concat(String.valueOf(this.a.getString(4)));
                            case 19:
                                return "image_display_state:".concat(String.valueOf(this.a.getString(50)));
                            default:
                                return "original_uri:".concat(String.valueOf(this.a.getString(5)));
                        }
                    }
                });
                if (db(50)) {
                    if (z) {
                        tqiVarArr2 = aj();
                        i6 = 0;
                    } else {
                        i6 = 0;
                        tqiVarArr2 = new tqi[]{C()};
                    }
                } else {
                    i6 = 0;
                    tqiVarArr2 = tqiVarArr;
                }
                final int i62 = 19;
                agmp.ds(length, tqiVarArr2, new alhr(this) { // from class: tbk
                    public final /* synthetic */ tbn a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.alhr
                    public final Object get() {
                        switch (i62) {
                            case 0:
                                return "cms_compressed_blob_id:".concat(String.valueOf(this.a.getString(36)));
                            case 1:
                                return "compressed_blob_id:".concat(String.valueOf(this.a.getString(35)));
                            case 2:
                                return "target_size:".concat(String.valueOf(this.a.getString(11)));
                            case 3:
                                return "compressed_blob_upload_permanent_failure:".concat(String.valueOf(this.a.getString(37)));
                            case 4:
                                return "compressed_blob_upload_timestamp:".concat(String.valueOf(this.a.getString(38)));
                            case 5:
                                return "media_encryption_key:".concat(String.valueOf(this.a.getString(39)));
                            case 6:
                                return "uri:".concat(String.valueOf(this.a.getString(3)));
                            case 7:
                                return "compressed_media_encryption_key:".concat(String.valueOf(this.a.getString(40)));
                            case 8:
                                return "missing_entry_in_telephony:".concat(String.valueOf(this.a.getString(41)));
                            case 9:
                                return "awaiting_reverse_sync:".concat(String.valueOf(this.a.getString(42)));
                            case 10:
                                return "file_size_bytes:".concat(String.valueOf(this.a.getString(43)));
                            case 11:
                                return "local_cache_path:".concat(String.valueOf(this.a.getString(44)));
                            case 12:
                                return "media_send_type:".concat(String.valueOf(this.a.getString(45)));
                            case 13:
                                return "processing_status:".concat(String.valueOf(this.a.getString(12)));
                            case 14:
                                return "voice_metadata:".concat(String.valueOf(this.a.getString(46)));
                            case 15:
                                return "validation_status:".concat(String.valueOf(this.a.getString(47)));
                            case 16:
                                return "processing_id:".concat(String.valueOf(this.a.getString(48)));
                            case 17:
                                return "rich_card_media_download_failure_reason:".concat(String.valueOf(this.a.getString(49)));
                            case 18:
                                return "content_type:".concat(String.valueOf(this.a.getString(4)));
                            case 19:
                                return "image_display_state:".concat(String.valueOf(this.a.getString(50)));
                            default:
                                return "original_uri:".concat(String.valueOf(this.a.getString(5)));
                        }
                    }
                });
                alob alobVar = new alob();
                while (i6 < length) {
                    long j = du[i6];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(du[i6]));
                        tbg c = PartsTable.c();
                        c.aB();
                        long j2 = du[i6];
                        if (strArr != null) {
                            c.B(strArr[i6]);
                        }
                        if (messageIdTypeArr != null) {
                            c.J(messageIdTypeArr[i6]);
                        }
                        if (strArr2 != null) {
                            c.X(strArr2[i6]);
                        }
                        if (uriArr != null) {
                            c.Z(uriArr[i6]);
                        }
                        if (strArr3 != null) {
                            c.t(strArr3[i6]);
                        }
                        if (uriArr5 != null) {
                            c.L(uriArr5[i6]);
                        }
                        if (uriArr7 != null) {
                            c.V(uriArr7[i6]);
                        }
                        if (iArr3 != null) {
                            c.ac(iArr3[i6]);
                        }
                        if (iArr6 != null) {
                            c.A(iArr6[i6]);
                        }
                        if (jArr2 != null) {
                            c.Y(jArr2[i6]);
                        }
                        if (uriArr6 != null) {
                            c.P(uriArr6[i6]);
                        }
                        if (jArr4 != null) {
                            c.W(jArr4[i6]);
                        }
                        if (tqlVarArr2 != null) {
                            c.Q(tqlVarArr2[i6]);
                        }
                        if (tqdVarArr2 != null) {
                            c.k(tqdVarArr2[i6]);
                        }
                        if (conversationIdTypeArr2 != null) {
                            c.u(conversationIdTypeArr2[i6]);
                        }
                        if (tqaVarArr2 != null) {
                            c.U(tqaVarArr2[i6]);
                        }
                        if (tqaVarArr4 != null) {
                            c.T(tqaVarArr4[i6]);
                        }
                        if (jArr6 != null) {
                            c.H(jArr6[i6]);
                        }
                        if (dArr4 != null) {
                            c.F(dArr4[i6]);
                        }
                        if (dArr3 != null) {
                            c.D(dArr3[i6]);
                        }
                        if (uriArr10 != null) {
                            c.N(uriArr10[i6]);
                        }
                        if (strArr16 != null) {
                            c.M(strArr16[i6]);
                        }
                        if (uriArr16 != null) {
                            c.x(uriArr16[i6]);
                        }
                        if (iArr7 != null) {
                            c.S(iArr7[i6]);
                        }
                        if (iArr8 != null) {
                            c.j(iArr8[i6]);
                        }
                        if (strArr17 != null) {
                            c.g(strArr17[i6]);
                        }
                        if (strArr18 != null) {
                            c.f(strArr18[i6]);
                        }
                        if (strArr19 != null) {
                            c.n(strArr19[i6]);
                        }
                        if (bArr5 != null) {
                            c.o(bArr5[i6]);
                        }
                        if (bArr6 != null) {
                            c.m(bArr6[i6]);
                        }
                        if (zArr5 != null) {
                            c.h(zArr5[i6]);
                        }
                        if (jArr13 != null) {
                            c.i(jArr13[i6]);
                        }
                        if (strArr20 != null) {
                            c.w(strArr20[i6]);
                        }
                        if (strArr21 != null) {
                            c.y(strArr21[i6]);
                        }
                        if (jArr9 != null) {
                            c.v(jArr9[i6]);
                        }
                        if (strArr11 != null) {
                            c.p(strArr11[i6]);
                        }
                        if (strArr13 != null) {
                            c.l(strArr13[i6]);
                        }
                        if (zArr6 != null) {
                            c.q(zArr6[i6]);
                        }
                        if (jArr14 != null) {
                            c.r(jArr14[i6]);
                        }
                        if (bArr7 != null) {
                            c.G(bArr7[i6]);
                        }
                        if (bArr8 != null) {
                            c.s(bArr8[i6]);
                        }
                        if (zArr7 != null) {
                            c.K(zArr7[i6]);
                        }
                        if (zArr8 != null) {
                            c.e(zArr8[i6]);
                        }
                        if (jArr12 != null) {
                            c.z(jArr12[i6]);
                        }
                        if (strArr15 != null) {
                            c.E(strArr15[i6]);
                        }
                        if (tqjVarArr2 != null) {
                            c.I(tqjVarArr2[i6]);
                        }
                        if (aggpVarArr2 != null) {
                            c.ab(aggpVarArr2[i6]);
                        }
                        if (tqwVarArr2 != null) {
                            c.aa(tqwVarArr2[i6]);
                        }
                        if (pyzVarArr2 != null) {
                            c.O(pyzVarArr2[i6]);
                        }
                        if (tqqVarArr != null) {
                            c.R(tqqVarArr[i6]);
                        }
                        if (tqiVarArr2 != null) {
                            c.C(tqiVarArr2[i6]);
                        }
                        alobVar.h(c.a());
                    }
                    i6++;
                }
                return alobVar.g();
            }
        }
        int i63 = alog.d;
        return alsx.a;
    }

    public final int g() {
        return getInt(cI(8, PartsTable.a));
    }

    public final int h() {
        return getInt(cI(23, PartsTable.a));
    }

    public final int i() {
        return getInt(cI(7, PartsTable.a));
    }

    public final long j() {
        return getLong(cI(31, PartsTable.a));
    }

    public final long k() {
        return getLong(cI(38, PartsTable.a));
    }

    public final long l() {
        return getLong(cI(34, PartsTable.a));
    }

    public final long m() {
        return getLong(cI(43, PartsTable.a));
    }

    public final long n() {
        return getLong(cI(17, PartsTable.a));
    }

    public final long o() {
        return getLong(cI(11, PartsTable.a));
    }

    public final long p() {
        return getLong(cI(9, PartsTable.a));
    }

    public final Uri q() {
        String string = getString(cI(22, PartsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri r() {
        String string = getString(cI(5, PartsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri s() {
        String string = getString(cI(20, PartsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri t() {
        String string = getString(cI(10, PartsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri u() {
        String string = getString(cI(6, PartsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri v() {
        String string = getString(cI(3, PartsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final pyz w() {
        return pzm.a(getString(cI(48, PartsTable.a)));
    }

    public final ConversationIdType x() {
        return new ConversationIdType(getLong(cI(14, PartsTable.a)));
    }

    public final MessageIdType y() {
        return new MessageIdType(getLong(cI(1, PartsTable.a)));
    }

    public final tqa z() {
        return wch.I(getString(cI(16, PartsTable.a)));
    }

    @Override // defpackage.agmq
    public final Cursor a() {
        return this;
    }
}
