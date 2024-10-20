package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ukt implements uld {
    @Override // defpackage.uld
    public final List a() {
        String[] strArr = PartsTable.a;
        String[] strArr2 = sgv.a;
        return alog.r("CREATE TRIGGER on_parts_delete_save_blob_bk AFTER DELETE ON parts FOR EACH ROW BEGIN INSERT INTO cms_blobs_pending_delete (message_id,blob_id) SELECT OLD.message_id,OLD.cms_full_size_blob_id WHERE OLD.cms_full_size_blob_id IS NOT NULL; INSERT INTO cms_blobs_pending_delete (message_id,blob_id) SELECT OLD.message_id,OLD.cms_compressed_blob_id WHERE OLD.cms_compressed_blob_id IS NOT NULL; END");
    }
}
