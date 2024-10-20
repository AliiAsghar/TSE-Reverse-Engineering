package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rny implements aglx {
    public static final rny a = new rny();
    public static final Map b = aqjn.m(new armo(c("_id"), d("_id")), new armo(c("message_id"), d("message_id")), new armo(c("content_type"), d("content_type")), new armo(c("source"), d("source")), new armo(c(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT), d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT)), new armo(c("width"), d("width")), new armo(c("height"), d("height")), new armo(c("longitude"), d("longitude")), new armo(c("latitude"), d("latitude")), new armo(c("cms_full_size_blob_id"), d("cms_full_size_blob_id")), new armo(c("cms_media_encryption_key"), d("cms_media_encryption_key")), new armo(c("cms_compressed_media_encryption_key"), d("cms_compressed_media_encryption_key")), new armo(c("cms_compressed_blob_id"), d("cms_compressed_blob_id")), new armo(c("file_name"), d("file_name")));

    private rny() {
    }

    private static final rnq c(String str) {
        String str2;
        agmh[] m = uzz.m();
        for (int i = 0; i < 14; i++) {
            agmh agmhVar = m[i];
            String d = agmhVar.d();
            if (d != null) {
                str2 = arsd.I(d, '.', d);
            } else {
                str2 = null;
            }
            if (d.F(str2, str)) {
                agmhVar.getClass();
                return (rnq) agmhVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final tbi d(String str) {
        String str2;
        agmh[] d = ucm.d();
        for (int i = 0; i < 51; i++) {
            agmh agmhVar = d[i];
            String d2 = agmhVar.d();
            if (d2 != null) {
                str2 = arsd.I(d2, '.', d2);
            } else {
                str2 = null;
            }
            if (d.F(str2, str)) {
                agmhVar.getClass();
                return (tbi) agmhVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.aglx
    public final void a() {
        rnt rntVar = new rnt();
        rntVar.e();
        rntVar.a().V();
    }

    @Override // defpackage.aglx
    public final void b() {
        agof agofVar = new agof("parts_backup", "backup");
        agofVar.d = 5;
        Map map = b;
        rnq[] rnqVarArr = (rnq[]) map.keySet().toArray(new rnq[0]);
        agofVar.b((agmh[]) Arrays.copyOf(rnqVarArr, rnqVarArr.length));
        tbs d = PartsTable.d();
        d.q();
        tbi[] tbiVarArr = (tbi[]) map.values().toArray(new tbi[0]);
        d.c((tbi[]) Arrays.copyOf(tbiVarArr, tbiVarArr.length));
        agofVar.c = d.b();
        agofVar.a().a();
    }
}
