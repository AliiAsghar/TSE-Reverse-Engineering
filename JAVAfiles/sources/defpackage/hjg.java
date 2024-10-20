package defpackage;

import android.content.ContentProviderOperation;
import com.android.vcard.VCardEntry;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface hjg {
    void constructInsertOperation(List<ContentProviderOperation> list, int i);

    VCardEntry.EntryLabel getEntryLabel();

    boolean isEmpty();
}
