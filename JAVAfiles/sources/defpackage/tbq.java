package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tbq implements agnn {
    @Override // defpackage.agnn
    public final String a() {
        return "parts";
    }

    @Override // defpackage.agnn
    public final void b(agnw agnwVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("content_type TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("original_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("storage_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("width INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("height INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("timestamp INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("output_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("target_size INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("processing_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_attachment_processing_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sticker_set_id INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sticker_id INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("media_modified_timestamp INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("longitude REAL DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("latitude REAL DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("preview_content_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("preview_content_type TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("fallback_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("source INT DEFAULT(13)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("bundle_index INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("blob_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("blob_gaia_email TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_full_size_blob_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_media_encryption_key BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_compressed_media_encryption_key BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("blob_upload_permanent_failure INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("blob_upload_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("expressive_sticker_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("file_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("duration INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("compressed_blob_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_compressed_blob_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("compressed_blob_upload_permanent_failure INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("compressed_blob_upload_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("media_encryption_key BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("compressed_media_encryption_key BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("attachment_upload_response BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("missing_entry_in_telephony INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("awaiting_reverse_sync INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("file_size_bytes INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("local_cache_path TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("media_send_type INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("voice_metadata BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("validation_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("processing_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rich_card_media_download_failure_reason INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("image_display_state INT DEFAULT(0)");
        sb.insert(0, "CREATE TABLE parts (");
        sb.append(", FOREIGN KEY (message_id) REFERENCES messages (_id) ON DELETE CASCADE FOREIGN KEY (conversation_id) REFERENCES conversations (_id) ON DELETE CASCADE);");
        agnwVar.z(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_parts_message_id");
        arrayList.add("CREATE INDEX index_parts_message_id ON parts(message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_parts_content_type");
        arrayList.add("CREATE INDEX index_parts_content_type ON parts(content_type);");
        arrayList.add("DROP INDEX IF EXISTS index_parts_output_uri");
        arrayList.add("CREATE INDEX index_parts_output_uri ON parts(output_uri) WHERE output_uri NOT NULL;");
        arrayList.add("DROP INDEX IF EXISTS index_parts_conversation_id");
        arrayList.add("CREATE INDEX index_parts_conversation_id ON parts(conversation_id);");
        arrayList.add("DROP INDEX IF EXISTS index_parts_preview_content_type");
        arrayList.add("CREATE INDEX index_parts_preview_content_type ON parts(preview_content_type) WHERE preview_content_type NOT NULL;");
        arrayList.add("DROP INDEX IF EXISTS index_parts_file_size_bytes");
        arrayList.add("CREATE INDEX index_parts_file_size_bytes ON parts(file_size_bytes) WHERE file_size_bytes <> 0;");
        arrayList.add("DROP INDEX IF EXISTS index_parts_local_cache_path");
        arrayList.add("CREATE INDEX index_parts_local_cache_path ON parts(local_cache_path) WHERE local_cache_path NOT NULL;");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            agnwVar.z(str);
        }
    }
}
