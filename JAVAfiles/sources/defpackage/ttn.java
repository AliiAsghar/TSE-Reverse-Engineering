package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ttn {
    private static final xze a = xze.g("BugleEtouffee", "EncryptedFileUploadPostprocessor");
    private final pwb b = new pwb();

    public final qep a(qep qepVar, String str, String str2) {
        aozy builder = qepVar.toBuilder();
        if (str != null) {
            if (str.length() != 0) {
                a.l("File name in FileInformation replaced with name from database.");
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                ((qep) builder.b).c = str;
            } else {
                throw new ttm();
            }
        }
        if (str2 != null) {
            try {
                ContentType d = ContentType.d(str2);
                a.l("Content type in FileInformation replaced with type from database.");
                qel qelVar = (qel) this.b.m().fu(d);
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                qep qepVar2 = (qep) builder.b;
                qelVar.getClass();
                qepVar2.e = qelVar;
                qepVar2.b |= 1;
            } catch (IllegalArgumentException e) {
                throw new ttm("Unable to parse file content type from EtouffeeRcsMetadataTable", e);
            }
        }
        return (qep) builder.s();
    }

    public final qeq b(MessageCoreData messageCoreData, qeq qeqVar) {
        Object apply;
        if (!messageCoreData.cn()) {
            return qeqVar;
        }
        try {
            akrh e = aktp.e("EncryptedFileUploadPostprocessor#updateResponse");
            try {
                rve D = messageCoreData.D();
                rbp rbpVar = new rbp(this, qeqVar, 20, null);
                spt b = spv.b();
                b.w("etouffee_rcs_metadata.queryOnRcsMessageId");
                spu spuVar = new spu();
                spuVar.b(D);
                b.k(new agpw(spuVar));
                spm spmVar = (spm) agnc.b(b.b());
                if (spmVar != null) {
                    apply = rbpVar.apply(spmVar);
                    qeq qeqVar2 = (qeq) apply;
                    e.close();
                    return qeqVar2;
                }
                throw new IllegalStateException("row not found");
            } finally {
            }
        } catch (IllegalStateException e2) {
            throw new ttm("Expected EtouffeeRcsMetadata table row is missing.", e2);
        }
    }
}
