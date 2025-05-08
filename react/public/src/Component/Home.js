// Home.js
import React from 'react';
import Calendar from './Calendar';

function Home() {
  return (
    <div>
      <header>
        <span style={{ fontSize: '500%'}}><b>D</b></span>
        <span style={{ fontSize: '300%' }}>eveloper</span>&emsp;
        <span style={{ fontSize: '500%' }}><b>C</b></span>
        <span style={{ fontSize: '300%' }}>areer</span>&emsp;
        <span style={{ fontSize: '500%' }}><b>H</b></span>
        <span style={{ fontSize: '300%' }}>ub</span>

        <nav>
          <ul>
            <li className="menu-item">
              <a href="#">지원공고</a>&emsp;&emsp;&emsp;
            </li>
            <li><a href="#">|</a></li>&emsp;&emsp;&emsp;
            <li className="menu-item">
              <a href="#">포트폴리오</a>&emsp;&emsp;&emsp;
            </li>
            <li><a href="#">|</a></li>&emsp;&emsp;&emsp;
            <li className="menu-item">
              <a href="#">커뮤니티</a>&emsp;&emsp;&emsp;
            </li>
            <li><a href="#">|</a></li>&emsp;&emsp;&emsp;
            <li className="menu-item">
              <a href="#">개발자교육</a>&emsp;&emsp;&emsp;
            </li>
            <li><a href="#">|</a></li>&emsp;&emsp;&emsp;
            <li className="menu-item">
              <a href="#">코딩학습</a>&emsp;&emsp;&emsp;
            </li>
          </ul>
        </nav>
      </header>

      <div className="container">
        <div className="login-box">
          <h2>로그인</h2>
          <form className="login-form">
            <input type="text" placeholder="사용자 이름" required /><br />
            <input type="password" placeholder="비밀번호" required /><br />
            <button type="submit">로그인</button>
          </form>
        </div>
        <div id="main">
          <h2>진행 중인 공모전</h2>
        </div>

        <div id="calendar-container">
          <Calendar /> {/* 캘린더 컴포넌트를 사용 */}
        </div>
      </div>

      <footer>
        &copy; Developer Career Hub
      </footer>
    </div>
  );
}

export default Home;
