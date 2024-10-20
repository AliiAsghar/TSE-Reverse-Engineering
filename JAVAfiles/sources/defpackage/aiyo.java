package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiyo implements aiym {
    public static final String a = "aiyo";
    public static final String[] b = {ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "chset"};
    public static final String[] c = {"_id"};
    public static final ContentValues d;
    public static final ContentValues e;
    public static final ContentValues f;
    public final ContentResolver g;
    public final aegu h;
    public final aiyp i;
    public final alor j;
    public final akyr k;

    static {
        ContentValues contentValues = new ContentValues(6);
        d = contentValues;
        contentValues.put("read", (Integer) 1);
        contentValues.put("seen", (Integer) 1);
        contentValues.put("sub_id", (Integer) (-1));
        contentValues.put("msg_box", (Integer) 0);
        contentValues.put("text_only", (Integer) 1);
        ContentValues contentValues2 = new ContentValues(2);
        e = contentValues2;
        contentValues2.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, (Integer) 0);
        contentValues2.put("charset", (Integer) 106);
        f = new ContentValues(2);
    }

    public aiyo(ContentResolver contentResolver, aegu aeguVar, aiyp aiypVar, akyr akyrVar, alor alorVar) {
        this.g = contentResolver;
        this.h = aeguVar;
        this.i = aiypVar;
        this.k = akyrVar;
        this.j = alorVar;
        d.put("thread_id", Long.valueOf(aiypVar.a(Collections.emptySet())));
    }
}
