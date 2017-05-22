
// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/omnibox/browser/autocomplete_match.h

package org.chromium.chrome.browser.omnibox;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MatchClassificationStyle {
  @IntDef({
      NONE, URL, MATCH, DIM
  })
  @Retention(RetentionPolicy.SOURCE)
  public @interface MatchClassificationStyleEnum {}
  public static final int NONE = 0;
  public static final int URL = 1 << 0;
  public static final int MATCH = 1 << 1;
  public static final int DIM = 1 << 2;
}