package defpackage;

import android.graphics.Rect;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface aack {
    boolean A(rry rryVar);

    boolean E(aacl aaclVar, MessagePartCoreData messagePartCoreData, Rect rect, boolean z);

    List J(List list, int i);

    int a();

    rsa c();

    rti d(SelfIdentityId selfIdentityId);

    Optional f(MessageIdType messageIdType);

    void h(SuggestionData suggestionData);

    void k(rry rryVar);

    void s();
}
